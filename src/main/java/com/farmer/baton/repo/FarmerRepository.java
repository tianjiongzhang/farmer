package com.farmer.baton.repo;

import com.farmer.baton.model.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FarmerRepository extends JpaRepository<Farmer, Long>, JpaSpecificationExecutor<Farmer> {

}
