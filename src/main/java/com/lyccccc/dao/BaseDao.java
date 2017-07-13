package com.lyccccc.dao;

/**
 * Created by Liuyuchen on 2017/07/13.
 */
public interface BaseDao<T> {
    public void save(T entity);

    public T findById(int id);
}
