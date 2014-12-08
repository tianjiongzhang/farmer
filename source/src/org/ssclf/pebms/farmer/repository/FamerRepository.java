package org.ssclf.pebms.farmer.repository;

import org.springframework.stereotype.Repository;
import org.ssclf.pebms.base.repository.BaseRepository;
import org.ssclf.pebms.farmer.model.Farmer;

@Repository("famaerRepository")
public class FamerRepository extends BaseRepository implements IFarmerRepository{

	public void saveFarmer(Farmer farmer) {
		this.persist(farmer);
	}

	public Farmer findFarmerById(long id) {
		return this.em.find(Farmer.class,id);
	}

	public void updateFarmer(Farmer farmer) {
 		this.em.merge(farmer);
	}
    
}
