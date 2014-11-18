/**
 * @(#) AuthorityFilter.java Created on 2010-10-21
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.authority.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * The class <code>AuthorityFilter</code> 基础过滤器类，主要用途包括以下几个方面：
 * 1) Authentication Filters 
 * 2) Logging and Auditing Filters 
 * 3) Image conversion Filters 
 * 4) Data compression Filters 
 * 5) Encryption Filters 
 * 6) Tokenizing Filters 
 * 7) Filters that trigger resource access events 
 * 8) XSL/T filters 
 * 9) Mime-type chain Filter 
 *
 * @author xushengyong264@pingan.com.cn
 * @version 2010-10-04
 */
public class AuthorityFilter implements Filter {

    /*
     * (non-Javadoc)
     * 
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest,
     * javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub

        // 调用FilterChain中的下一个Filter
        chain.doFilter(request, response);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.servlet.Filter#destroy()
     */
    public void destroy() {
        // TODO Auto-generated method stub
    }

}
