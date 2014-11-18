/**
 * @(#) UploadImage.java Created on 2011-1-3
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.user.controller;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * The class <code>UploadImage</code> 上传图片
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 1.0
 */
public class PortraitFile {

    /**
     * 文件
     */
    private CommonsMultipartFile content;

    /**
     * @param content
     *            the content to set
     */
    public void setContent(CommonsMultipartFile content) {
        this.content = content;
    }

    /**
     * @return the content
     */
    public CommonsMultipartFile getContent() {
        return content;
    }
    
}
