package org.ssclf.pebms.volunteer.repository;

import java.util.List;

import org.ssclf.pebms.base.repository.IBaseRepository;
import org.ssclf.pebms.volunteer.model.Farmer;

public interface IVolunteerRespository extends IBaseRepository {
	/**
     * 查询用户
     * 
     * @param firstResult
     * @param maxResults
     * @return
     */
    List<Farmer> queryFarmers(final int firstResult, final int maxResults);
}
