package com.smart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Administrator on 2015/4/17.
 */
public class BaseDao<T> {
    private Class<T> entityclass;
    @Autowired
    private  HibernateTemplate hibernateTemplate;
    public BaseDao(){
        Type type = getClass().getGenericSuperclass();
        Type trueType = ((ParameterizedType)type).getActualTypeArguments()[0];
        this.entityclass =(Class<T>) trueType;
    }

    /**
     * 根据Id加载数据
     * @param id
     * @return
     */
    public T load(Serializable id){
        return (T)hibernateTemplate.load(entityclass,id);
    }

    /**
     * 加载所有数据
     * @return
     */
    public List<T> loadAll(){
        return hibernateTemplate.loadAll(entityclass);
    }

    /**
     * 根据id获取数据
     * @param id
     * @return
     */
    public T get(Serializable id){
        return hibernateTemplate.get(entityclass,id);
    }

    /**
     * 保存对象
     */
    public void  save(T entity ){
        hibernateTemplate.save(entity);
    }

    /**
     * 删除数据
     */
    public void remove(T entity){
        hibernateTemplate.delete(entity);
    }

    /**
     * 更新数据
     * @param entity
     */
    public void update(T entity){
        hibernateTemplate.update(entity);
    }

    /**
     * 查询数据
     * @param queryString
     * @return
     */
    public List<T> find(String queryString){
        return hibernateTemplate.find(queryString);
    }

    /**
     * 带参数查询数据
     * @param queryString
     * @param params
     * @return
     */
    public List<T> find(String queryString,Object...params){
        return hibernateTemplate.find(queryString,params);
    }
}
