/**
 * @(#) PEBMSEncryptor.java Created on 2011-2-28
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.utility;

import java.security.MessageDigest;

import it.sauronsoftware.base64.Base64;

/**
 * The class <code>PEBMSEncryptor</code>
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 1.0
 */
public class PEBMSEncryptor {

    /**
     * MD5：信息摘要算法
     */
    private static final String KEY_MD5 = "MD5";

    /**
     * SHA：安全散列算法
     */
    private static final String KEY_SHA = "SHA";

    /**
     * 编码，采用BASE64格式
     * 
     * @param key
     * @return
     * @throws Exception
     */
    public static String encBASE64(String key) throws Exception {
        return Base64.encode(key);
    }

    /**
     * 解码，采用BASE64格式
     * 
     * @param key
     * @return
     * @throws Exception
     */
    public static String decBASE64(String key) throws Exception {
        return Base64.decode(key);
    }

    /**
     * MD5摘要
     * 
     * @param key
     * @return
     * @throws Exception
     */
    public static String encMD5(String key) throws Exception {
        MessageDigest md5 = MessageDigest.getInstance(KEY_MD5);
        md5.update(key.getBytes());
        return new String(md5.digest());
    }

    /**
     * SHA摘要
     * 
     * @param key
     * @return
     * @throws Exception
     */
    public static String encSHA(String key) throws Exception {
        MessageDigest sha = MessageDigest.getInstance(KEY_SHA);
        sha.update(key.getBytes());
        return new String(sha.digest());
    }

}
