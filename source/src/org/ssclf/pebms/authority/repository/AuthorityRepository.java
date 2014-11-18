/**
 * @(#) AuthorityRepository.java Created on 2010-10-21
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.authority.repository;

import org.springframework.stereotype.Repository;

import org.ssclf.pebms.base.repository.BaseRepository;

/**
 * 权限数据库访问对象
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 2010-10-01
 */
@Repository("authorityRepo")
public class AuthorityRepository extends BaseRepository implements
        IAuthorityRepository {

}
