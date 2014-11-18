/**
 * @(#) BaseEntity.java Created on 2010-10-21
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.base.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


/**
 * The class <code>BaseEntity</code> 实体对象基础类（四色原型: Party, Place, Thing）
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 1.0
 */
@MappedSuperclass
public abstract class BaseEntity extends BaseObject {
    private static final long serialVersionUID = 1L;

    /**
     * 创建人
     */
    @Column(name = "CREATOR_ID", nullable = false)
    private Long creatorId;

    /**
     * 创建日期
     */
    @DateTimeFormat(style = "S")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", nullable = false)
    private Date createDate;

    /**
     * 状态
     */
    @Column(name = "STATUS", nullable = false)
    private Character status;

    /**
     * @return the creatorId
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * @param creatorId
     *            the creatorId to set
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * @return the createDate
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     *            the createDate to set
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return the status
     */
    public Character getStatus() {
        return status;
    }

    /**
     * @param status
     *            the status to set
     */
    public void setStatus(Character status) {
        this.status = status;
    }

}
