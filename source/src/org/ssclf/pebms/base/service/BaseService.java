/**
 * @(#) BaseService.java Created on 2010-11-13
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.ssclf.pebms.utility.PEBMSLocale;

/**
 * The class <code>BaseService</code> 基础服务类
 *
 * @author xushengyong264@pingan.com.cn
 * @version 1.0
 */
public class BaseService implements IBaseService {
    
    protected static final String SCHEME_HTTP = "http";
    
    @Autowired
    protected PEBMSLocale wnxLocale;
    
}
