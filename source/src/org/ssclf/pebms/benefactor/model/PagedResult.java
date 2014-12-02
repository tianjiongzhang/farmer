package org.ssclf.pebms.benefactor.model;

import java.io.Serializable;
import java.util.List;

public class PagedResult implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int totalNumber ;
	
	private List<?> resultList ;
	
	private int pageNo ;
	
	private int pageSize = 5;

	private int allPages ;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getAllPages() {
		return (totalNumber / pageSize) + 1 ;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

	public List<?> getResultList() {
		return resultList;
	}

	public void setResultList(List<?> resultList) {
		this.resultList = resultList;
	}

}
