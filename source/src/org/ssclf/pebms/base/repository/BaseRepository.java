/**
 * @(#) BaseRepository.java Created on 2010-10-21
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.base.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



/**
 * 基础数据访问对象类
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 2010-10-01
 */
public class BaseRepository implements IBaseRepository {

    /**
     * 属性/方法级注入EntityManager
     */
    @PersistenceContext
    protected EntityManager em;

    /*
     * (non-Javadoc)
     * 
     * @see com.xushengyong264@pingan.com.cn.repository.IBaseRepository#flush()
     */
    public void flush() {
        em.flush();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.xushengyong264@pingan.com.cn.repository.IBaseRepository#create(java.lang.Object)
     */
    public void persist(Object obj) {
        if (null == obj) {
            return;
        }
        
        em.persist(obj);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.xushengyong264@pingan.com.cn.repository.IBaseRepository#remove(java.lang.Object)
     */
    public void remove(Object obj) {
        if (null == obj) {
            return;     
        }
        
        em.remove(obj);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.xushengyong264@pingan.com.cn.repository.IBaseRepository#removeById(java.lang.Class,
     * java.lang.Object)
     */
    public <T> void removeById(Class<T> objClass, Object id) {
        if (null == id) {
            return;
        }
        
        em.remove(em.getReference(objClass, id));
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.xushengyong264@pingan.com.cn.repository.IBaseRepository#findById(java.lang.Class,
     * java.lang.Object)
     */
    public <T> T findById(Class<T> objClass, Object id) {
        if (null == id) {
            return null;
        }
        
        return em.find(objClass, id);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.xushengyong264@pingan.com.cn.repository.IBaseRepository#merge(java.lang.Object)
     */
    public <T> T merge(T obj) {
        if (null == obj) {
            return null;
        }
        
        return em.merge(obj);
    }
    
}
