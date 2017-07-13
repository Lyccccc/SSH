package com.lyccccc.dao.impl;

import com.lyccccc.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by Liuyuchen on 2017/07/13.
 */
@Repository("baseDao")
@Transactional
public class BaseDaoImpl<T> implements BaseDao<T> {
    private Class<T> clazz;
    private String tag = null;
    @Autowired
    private SessionFactory sessionFactory;

    public BaseDaoImpl() {
        Type type = this.getClass().getGenericSuperclass();
        // 要使用判定，因为第一个对象是BaseDaoImpl，这个不能进行强转（父类是obj）
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            clazz = (Class<T>) parameterizedType.getActualTypeArguments()[0];
            System.out.println("DAO的实现类是：" + this.clazz.getName());
        } else {
            tag = "elsetag";
        }
    }

    public void save(T entity) {
        this.getSession().save(entity);
    }

    public T findById(int id) {
        return getSession().get(clazz,id);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession(){
        System.out.println("dao中的sessionFactory  " + sessionFactory);
        return this.getSessionFactory().getCurrentSession();
//        return this.getSessionFactory().openSession();
    }
}
