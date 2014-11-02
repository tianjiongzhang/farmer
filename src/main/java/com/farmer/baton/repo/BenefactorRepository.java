package com.farmer.baton.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.farmer.baton.model.Benefactor;

public interface BenefactorRepository extends JpaRepository<Benefactor, Long>, JpaSpecificationExecutor<Benefactor>{

}
