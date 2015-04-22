package com.smart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Administrator on 2015/4/17.
 */
public class BaseDao<T>  {
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
        return (T)getHibernateTemplate().load(entityclass,id);
    }

    /**
     * 加载所有数据
     * @return
     */
    public List<T> loadAll(){
        return getHibernateTemplate().loadAll(entityclass);
    }

    /**
     * 根据id获取数据
     * @param id
     * @return
     */
    public T get(Serializable id){
        return getHibernateTemplate().get(entityclass,id);
    }

    /**
     * 保存对象
     */
    public void  save(T entity ){
        getHibernateTemplate().save(entity);
    }

    /**
     * 删除数据
     */
    public void remove(T entity){
        getHibernateTemplate().delete(entity);
    }

    /**
     * 更新数据
     * @param entity
     */
    public void update(T entity){
        getHibernateTemplate().update(entity);
    }

    /**
     * 查询数据
     * @param queryString
     * @return
     */
    public List<T> find(String queryString){
        return getHibernateTemplate().find(queryString);
    }

    /**
     * 带参数查询数据
     * @param queryString
     * @param params
     * @return
     */
    public List<T> find(String queryString,Object...params){
        return getHibernateTemplate().find(queryString,params);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }
}
