/**
 * @(#) BaseImage.java Created on 2010-10-21
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.base.model;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;


/**
 * The class <code>BaseImage</code> 图片对象基类
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 1.0
 */
@MappedSuperclass
public abstract class BaseImage extends BaseObject {
    private static final long serialVersionUID = 1L;

    /**
     * 内容
     */
    @Lob
    @Column(name = "CONTENT", nullable = false)
    private byte[] content;

    /**
     * @param content
     *            the content to set
     */
    public void setContent(byte[] content) {
        this.content = content;
    }

    /**
     * @return the content
     */
    public byte[] getContent() {
        return content;
    }

}
