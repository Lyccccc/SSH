package com.lyccccc.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Liuyuchen on 2017/07/13.
 */
@Entity
@Table(name= "blog_article")
public class BlogArticle {
    @Id
    @Column(name = "article_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int articleId;
    @Column(name = "article_name")
    private String articleName;
    @Column(name = "create_time")
    private Timestamp createTime;
    @Column(name = "update_time")
    private Timestamp updateTime;
    @Column(name = "context_path")
    private String contextPath;

    public BlogArticle(){ }

    public BlogArticle(int articleId, String articleName, Timestamp createTime, Timestamp updateTime, String contextPath) {
        this.articleId = articleId;
        this.articleName = articleName;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.contextPath = contextPath;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }
}
