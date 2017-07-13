package com.lyccccc.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.proxy.DruidDriver;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;
import javax.transaction.TransactionManager;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Lenovo on 2017/07/10.
 */
@Configuration
@ComponentScan(basePackages = {"com.lyccccc"},
    excludeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION,value = EnableWebMvc.class)
    })
@EnableTransactionManagement
public class RootConfig {
    //multipart解析器
    @Bean
    public MultipartResolver multipartResolver() throws IOException{
        return new StandardServletMultipartResolver();
    }

    //datasource
    @Bean
    public DataSource dataSource() throws Exception{
        DruidDataSource druidDataSource = new DruidDataSource();
        //基本属性
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC");
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
        //连接数
        druidDataSource.setInitialSize(1);
        druidDataSource.setMinIdle(1);
        druidDataSource.setMaxActive(10);
        //校验sql
        druidDataSource.setValidationQuery("select 1");
        //最大等待超时时间
        druidDataSource.setMaxWait(60000);
        druidDataSource.init();
        return druidDataSource;
    }

    //sessionfactory
    @Bean
    public SessionFactory sessionFactory(DataSource dataSource) throws Exception{
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setPackagesToScan("com.lyccccc.model");
        Properties pros = new Properties();
        pros.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5InnoDBDialect");
        pros.setProperty("hibernate.show_sql","true");
        pros.setProperty("hibernate.format_sql","true");
        pros.setProperty("hibernate.id.new_generator_mappings","false");
        pros.setProperty("hibernate.hbm2ddl.auto","update");
        sessionFactory.setHibernateProperties(pros);
        try {
            //这个方法是真正生成sessionFactory的
            sessionFactory.afterPropertiesSet();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory.getObject();
    }

    //事务管理器
    @Bean
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) throws Exception{
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        System.out.println("事务中的sessionFactory:" + sessionFactory);
        transactionManager.setSessionFactory(sessionFactory);
        return transactionManager;
    }
}
