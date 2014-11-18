/**
 * @(#) BaseCatalog.java Created on 2010-10-21
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.base.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * The class <code>BaseCatalog</code>目录对象基础类（四色原型: Description,
 * Catalog-Entry-Like），目录不需要创建、更新、删除，目录不存在状态，自然存在，亘古不变。
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 1.0
 */
@MappedSuperclass
public abstract class BaseCatalog extends BaseObject {
    private static final long serialVersionUID = 1L;

    /**
     * 分类名称
     */
    @NotNull(message = "名称不能为空！")
    @Size(min = 1, max = 128, message = "名称最少 {min}，最大 {max}个字符！")
    @Column(name = "NAME", nullable = false, unique = true, columnDefinition = "varchar(128)")
    private String name;

    /**
     * 分类描述
     */
    @Size(min = 1, max = 1024, message = "描述最少 {min}，最大 {max}个字符！")
    @Column(name = "DESCRIPTION", columnDefinition = "varchar(1024)")
    private String description;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
