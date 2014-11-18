/**
 * @(#) BaseController.java Created on 2010-10-27
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.base.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;
import org.ssclf.pebms.base.model.BaseImage;
import org.ssclf.pebms.utility.PEBMSLocale;

/**
 * The class <code>BaseController</code> 基础控制器
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 1.0
 */
public class BaseController {

    /**
     * 字符编码UTF-8
     */
    protected static final String ENCODING_UTF8 = "UTF-8";

    /**
     * 图片的mime-type
     */
    protected static final String CONTENT_TYPE_IMAGE = "image/jpeg";
    protected static final String CONTENT_TYPE_PLAIN = "plain/text";

    /**
     * 已登录用户
     */
    protected static final String LOGINED_USER = "loginedUser";

    @Autowired
    protected PEBMSLocale pebmsLocale;

    /**
     * 校验器
     */
    protected Validator validator;

    /**
     * 构造函数
     * 
     * @param validator
     */
    public BaseController(Validator validator) {
        this.validator = validator;
    }

    /**
     * 回写错误信息给客户端
     * 
     * @param resp
     */
    protected void writeError(List<ObjectError> errors, HttpServletResponse resp) {
        if ((null == errors) || errors.isEmpty() || (null == resp)) {
            return;
        }

        StringBuffer sb = new StringBuffer();
        for (ObjectError curErr : errors) {
            sb.append(curErr.toString());
        }

        // 设置3个禁止缓存参数
        resp.setHeader("Pragma", "No-cache");
        resp.setHeader("Cache-Control", "no-cache");
        resp.setDateHeader("Expires", 0);

        // 将错误信息直接写回到应答报文体中
        resp.setCharacterEncoding(ENCODING_UTF8);
        resp.setContentType(CONTENT_TYPE_PLAIN);
        // 可以让WEB容器在一个TCP连接中发送完
        resp.setContentLength(sb.length());
        try {
            resp.getWriter().print(sb.toString());
            resp.getOutputStream().flush();
        } catch (IOException e) {
            Logger.getLogger(this.getClass()).error(e.getMessage());
        }
    }

    /**
     * 回写图片内容给客户端
     * 
     * @param userId
     * @param portraitId
     * @param resp
     */
    protected void writeImage(BaseImage wnxImage, HttpServletResponse resp) {
        if ((null == wnxImage) || (null == resp)) {
            return;
        }

        // 设置3个禁止缓存参数
        resp.setHeader("Pragma", "No-cache");
        resp.setHeader("Cache-Control", "no-cache");
        resp.setDateHeader("Expires", 0);

        // 将图片字节码直接写回到应答报文体中
        resp.setCharacterEncoding(ENCODING_UTF8);
        resp.setContentType(CONTENT_TYPE_IMAGE);
        // 可以让WEB容器在一个TCP连接中发送完
        resp.setContentLength(wnxImage.getContent().length);
        try {
            resp.getOutputStream().write(wnxImage.getContent());
            resp.getOutputStream().flush();
        } catch (IOException e) {
            Logger.getLogger(this.getClass()).error(e.getMessage());
        }
    }

}
