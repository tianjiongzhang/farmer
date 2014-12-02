package org.ssclf.pebms.benefactor.repository;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.ssclf.pebms.base.repository.BaseRepository;
import org.ssclf.pebms.benefactor.model.Benefactor;
import org.ssclf.pebms.benefactor.model.PagedResult;

@Repository("beneRep")
public class BenefactorRepsitory extends BaseRepository implements IBenfactorRepsitory {

	@Override
	public PagedResult queryPagedBenefactors(int pageNo) {
		PagedResult pagedResult = new PagedResult() ;
		int total = this.getTotalBenefactorsCount() ;
		List<Benefactor> benefacotrs = this.queryPagedBenefactorsList(pageNo, pagedResult.getPageSize()) ;
		pagedResult.setPageNo(pageNo) ;
		pagedResult.setResultList(benefacotrs) ;
		pagedResult.setTotalNumber(total) ;
		return pagedResult; 
	}
	
	private int getTotalBenefactorsCount(){
		String queryString = "select count(*) from lc_benefactor b where b.status = '0'" ;
		Query query = em.createQuery(queryString) ;
		int total = ((Long) query.getSingleResult()).intValue() ;
		return total ;
	}
	
	private List<Benefactor> queryPagedBenefactorsList(int pageNo , int pageSize){
		String queryString = "select b from lc_benefactor b where b.status = '0'" ;
		Query query = em.createQuery(queryString) ;
		int index = pageSize * (pageNo - 1) ;
		query.setFirstResult(index) ;
		query.setMaxResults(pageSize) ;
		List<Benefactor> benefactors = query.getResultList() ;
		return benefactors ;
	}

	@Override
	public void deleteBenefactor(long id) {
		Benefactor benefactor = em.find(Benefactor.class , id) ;
		benefactor.setStatus("1") ;
		em.merge(benefactor) ;
	}

}
