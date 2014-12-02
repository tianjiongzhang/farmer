package org.ssclf.pebms.volunteer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ssclf.pebms.base.service.BaseService;
import org.ssclf.pebms.volunteer.model.Farmer;
import org.ssclf.pebms.volunteer.repository.IVolunteerRespository;

@Service("volunteerService")
public class VolunteerService extends BaseService implements IVolunteerService {

	@Autowired
	private IVolunteerRespository volunteerRespository;

	@Transactional(readOnly = true)
	public List<Farmer> queryFarmers(int firstResult, int maxResults) {
		return volunteerRespository.queryFarmers(firstResult, maxResults);
	}

}
