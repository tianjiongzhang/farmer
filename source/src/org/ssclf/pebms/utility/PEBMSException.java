/**
 * @(#) PEBMSException.java Created on 2010-10-23
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.utility;

import java.io.Serializable;

/**
 * The class <code>PEBMSException</code>
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 1.0
 */
public class PEBMSException extends Exception {
    private static final long serialVersionUID = 1L;
    
    /**
     * 参数
     */
    private Serializable[] args;

    /**
     * 构造函数
     */
    public PEBMSException() {
        super();
    }

    /**
     * 构造函数
     * 
     * @param message
     *            详细信息
     */
    public PEBMSException(String message) {
        super(message);
    }

    /**
     * 构造函数
     * 
     * @param cause
     *            异常原因
     */
    public PEBMSException(Throwable cause) {
        super(cause);
    }

    /**
     * 构造函数
     * 
     * @param message
     *            详细 信息
     * @param cause
     *            异常原因
     */
    public PEBMSException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 构造函数
     * 
     * @param message
     *            详细信息
     * @param args
     *            参数
     */
    public PEBMSException(String message, Serializable[] args) {
        super(message);
        this.args = args;
    }

    /**
     * 构造函数
     * 
     * @param message
     *            详细信息
     * @param cause
     *            异常原因
     * @param args
     *            参数
     */
    public PEBMSException(String message, Throwable cause, Serializable[] args) {
        super(message, cause);
        this.args = args;
    }

    /**
     * 获取参数
     * 
     * @return 参数
     */
    public Serializable[] getArgs() {
        return args;
    }

    /**
     * 设置参数
     * 
     * @param args
     *            参数
     */
    public void setArgs(Serializable[] args) {
        this.args = args;
    }

}
