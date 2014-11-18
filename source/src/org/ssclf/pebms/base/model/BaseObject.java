/**
 * @(#) BaseObject.java Created on 2011-8-30
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.base.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


/**
 * The class <code>BaseObject</code> 基础对象类
 *
 * @author xushengyong
 * @version 1.0
 */
@MappedSuperclass
public abstract class BaseObject implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /**
     * 是否已经删除
     */
    public static final Character DELETED_NOT = '0';
    public static final Character DELETED_YES = '1';

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Long id;

    /**
     * 删除标识
     */
    @Column(name = "DELETED", nullable = false)
    private Character deleted = DELETED_NOT;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * @return the deleted
     */
    public Character getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     *            the deleted to set
     */
    public void setDeleted(Character deleted) {
        this.deleted = deleted;
    }
    
}
