/**
 * @(#) IUserRepository.java Created on 2010-10-21
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.user.repository;

import java.util.List;

import org.ssclf.pebms.user.model.User;
import org.ssclf.pebms.base.repository.IBaseRepository;

/**
 * 用户数据库访问对象接口
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 2010-10-01
 */
public interface IUserRepository extends IBaseRepository {
    
    /**
     * 根据Email查找用户
     * 
     * @param email
     */
    User findUserByEmail(String email);

    /**
     * 查询用户
     * 
     * @param firstResult
     * @param maxResults
     * @return
     */
    List<User> queryUsers(final int firstResult, final int maxResults);
    
}
