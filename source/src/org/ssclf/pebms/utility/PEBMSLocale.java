/**
 * @(#) PEBMSLocale.java Created on 2010-10-23
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.utility;

import java.util.Formatter;

import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * The class <code>PEBMSLocale</code>
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 1.0
 */
public class PEBMSLocale {

    /**
     * 国际化资源
     */
    private ReloadableResourceBundleMessageSource messageSource;

    /**
     * 消息源（动态注入）
     * 
     * @param messageSource
     */
    public void setMessageSource(
            ReloadableResourceBundleMessageSource messageSource) {
        this.messageSource = messageSource;
    }

    /**
     * 从资源中找到配置信息并返回，若资源没有配置该项，将返回def指定的值
     * 
     * @param code
     *            配置项的名称
     * @param args
     *            配置项参数列表，当配置项中出现类似'%s'、'%d'之类的字符串时，这些字符串将最终被配置项参数列表中的值取代
     * @return 返回从资源中找到的配置信息，若资源没有配置该项，将返回def指定的值
     */
    public String getMessage(String code, Object... args) {
        String message = messageSource.getMessage(code, null, null);
        if (message == null) {
            return null;
        }
        
        if (args == null) {
            return message;
        }

        StringBuilder sb = new StringBuilder();
        Formatter ft = new Formatter(sb);
        ft.format(message, args);
        ft.close();
        return sb.toString();
    }

}
