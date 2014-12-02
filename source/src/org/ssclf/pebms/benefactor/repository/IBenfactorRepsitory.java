package org.ssclf.pebms.benefactor.repository;

import org.ssclf.pebms.base.repository.IBaseRepository;
import org.ssclf.pebms.benefactor.model.PagedResult;

public interface IBenfactorRepsitory extends IBaseRepository{

	/**
	 * 查询分页的捐助者列表
	 * @param pageNo
	 * @return
	 */
	public PagedResult queryPagedBenefactors(int pageNo) ;
	/**
	 * 删除捐助者
	 * @param id
	 */
	public void deleteBenefactor(long id) ;
	
}
