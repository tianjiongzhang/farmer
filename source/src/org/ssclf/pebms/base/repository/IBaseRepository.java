/**
 * @(#) IBaseRepository.java Created on 2010-10-21
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.base.repository;


/**
 * @author xushengyong264@pingan.com.cn
 * 
 */
public interface IBaseRepository {

    /**
     * 强制提交
     */
    void flush();

    /**
     * 创建对象
     * 
     * @param obj
     *            待创建对象
     */
    void persist(Object obj);

    /**
     * 删除对象
     * 
     * @param obj
     *            待删除对象
     */
    void remove(Object obj);

    /**
     * 根据主键删除对象
     * 
     * @param <T>
     * 
     * @param objClass
     * @param id
     */
    <T> void removeById(Class<T> objClass, Object id);

    /**
     * 获取对象
     * 
     * @param <T>
     * 
     * @param objClass
     *            待获取对象的类型
     * @param id
     *            待获取对象的主键
     * @return 目标对象
     */
    <T> T findById(Class<T> objClass, Object id);

    /**
     * 更新对象
     * 
     * @param <T>
     * @param obj
     *            待更新的对象
     * @return 更新后的对象
     */
    <T> T merge(T obj);
    
}
