package org.ssclf.pebms.volunteer.repository;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.ssclf.pebms.base.repository.BaseRepository;
import org.ssclf.pebms.volunteer.model.Farmer;

@Repository("volunteerRespository")
public class VolunteerRespository extends BaseRepository implements IVolunteerRespository {


	@Override
	public List<Farmer> queryFarmers(int firstResult, int maxResults) {
		if ((firstResult < 0) || (maxResults <= 0)) {
            return null;
        }
        
        String queryString = "select name,phoneNo,yearIncome,idNo,debt,address from Farmer order by createDate desc";
        Query query = em.createQuery(queryString);
        query.setFirstResult(firstResult);
        query.setMaxResults(maxResults);
        return query.getResultList();
	}

}
