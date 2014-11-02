package com.farmer.baton.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "benefactors")
public class Benefactor {
	/**
	 * DB主键，自增长
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ; 
	/**
	 * 捐助者类型，01-个人，02-机构
	 */
	@Basic
	private String benefactorType ;
	/**
	 * 姓名
	 */
	@Basic
	private String name ;
	/**
	 * 电话号码
	 */
	@Basic 
	private String telNumber ;
	/**
	 * 手机号码
	 */
	@Basic 
	private String mobileNumber ;
	/**
	 * 电子邮箱地址
	 */
	@Basic
	private String e_mail ;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBenefactorType() {
		return benefactorType;
	}
	public void setBenefactorType(String benefactorType) {
		this.benefactorType = benefactorType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
}
