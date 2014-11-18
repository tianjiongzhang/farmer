/**
 * @(#) UserRepository.java Created on 2010-10-21
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.user.repository;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import org.ssclf.pebms.user.model.User;
import org.ssclf.pebms.base.model.BaseEntity;
import org.ssclf.pebms.base.repository.BaseRepository;

/**
 * 用户数据库访问对象类
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 2010-10-01
 */
@Repository("userRepo")
public class UserRepository extends BaseRepository implements IUserRepository {

    @SuppressWarnings("unchecked")
    public User findUserByEmail(String email) {
        if (null == email || email.isEmpty()) {
            return null;
        }
        
        String queryString = "from User where deleted = :deleted and email = :email";
        Query query = em.createQuery(queryString);
        query.setParameter("deleted", BaseEntity.DELETED_NOT);
        query.setParameter("email", email);
        query.setMaxResults(1);
        List<User> resultList = query.getResultList();
        return (resultList.size() > 0) ? resultList.get(0) : null;
    }

    @SuppressWarnings("unchecked")
    public List<User> queryUsers(int firstResult, int maxResults) {
        if ((firstResult < 0) || (maxResults <= 0)) {
            return null;
        }
        
        String queryString = "from User where deleted = :deleted order by CREATE_DATE desc";
        Query query = em.createQuery(queryString);
        query.setParameter("deleted", BaseEntity.DELETED_NOT);
        query.setFirstResult(firstResult);
        query.setMaxResults(maxResults);
        return query.getResultList();
    }

}
