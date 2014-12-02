package org.ssclf.pebms.volunteer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.ssclf.pebms.base.model.BaseEntity;

/**
 * @author wangyingming
 * 
 */
@Entity
@Table(name = "LC_FARMER")
public class Farmer extends BaseEntity {
	private static final long serialVersionUID = -3124843558943875266L;
	@Column(name = "FARMER_ID", nullable = false, unique = true)
	private long id;// farmer_Id BIGINT(10) AUTO_INCREMENT COMMENT '主键，农户ID',

	@Column(name = "FARMER_NAME", nullable = false, unique = true)
	private String name;// farmer_Name varchar(20) COMMENT '农户姓名',

	@Column(name = "ID_NO", nullable = false, unique = true)
	private String idNo;// id_no varchar(20) COMMENT '身份证号码',

	@Column(name = "SEX", nullable = false, unique = true)
	private String sex;// sex varchar(2) COMMENT '性别',

	@Column(name = "AGE", nullable = false, unique = true)
	private int age;// age int(5) COMMENT '年龄',

	@Column(name = "PHONE_NO", nullable = false, unique = true)
	private String phoneNo;// phone_no varchar(20) COMMENT '电话',

	@Column(name = "ADDRESS", nullable = false, unique = true)
	private String address;// address varchar(50) COMMENT '地址',

	@Column(name = "COOPERATIVE_DEBT", nullable = false, unique = true)
	private double debt;// cooperative_debt double(10,0) COMMENT '在合作社的欠款或赊账金额',

	@Column(name = "CHIEF_RELA", nullable = false, unique = true)
	private String chiefRelationShip;// Chief_rela varchar(10) COMMENT '与社长关系',

	@Column(name = "FARMLAND", nullable = false, unique = true)
	private double farmland;// farmland double(5,0) COMMENT '可耕地面积（亩）',

	@Column(name = "LABORNUM", nullable = false, unique = true)
	private int laborNum;// laborNum int(5) COMMENT '劳动力个数',

	@Column(name = "INCOME", nullable = false, unique = true)
	private double yearIncome;// yearIncome double(10,0) COMMENT '年收入',

	@Column(name = "PLANAID_FINANCE", nullable = false, unique = true)
	private double planAidFinance;// planAid_Finance double(10,0) COMMENT '',

	@Column(name = "INCOME_MAINSOURCE", nullable = false, unique = true)
	private String incomeMainSource;// income_MainSource varchar(20) COMMENT
									// '家庭主要收入来源',

	@Column(name = "CURRENT_CROPSDETAIL", nullable = false, unique = true)
	private String currentCropsDetail;// current_CropsDetail varchar(20) COMMENT
										// '当前农作物描述',

	@Column(name = "CURRENT_CROPSACRE", nullable = false, unique = true)
	private int currentCropsAcre;// current_CropsAcre int(5) COMMENT
									// '当前主要农作物亩数',

	@Column(name = "PLAN_CROPSDETAIL", nullable = false, unique = true)
	private String planCropsDetail;// plan_CropsDetail varchar(20) COMMENT
									// '计划的种植农作物描述',

	@Column(name = "PLAN_CROPSACRE", nullable = false, unique = true)
	private String planCropsAcre;// plan_CropsAcre varchar(5) COMMENT
									// '计划种植或者养殖的农作物亩数',

	@Column(name = "UPT_ID", nullable = false, unique = true)
	private long updateId;// UPDATE_ID BIGINT(15) COMMENT '更新人',

	@Column(name = "UPT_DATE", nullable = false, unique = true)
	private Date updateDate;// UPDATE_DATE DATETIME COMMENT '更新时间',

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getDebt() {
		return debt;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}

	public String getChiefRelationShip() {
		return chiefRelationShip;
	}

	public void setChiefRelationShip(String chiefRelationShip) {
		this.chiefRelationShip = chiefRelationShip;
	}

	public double getFarmland() {
		return farmland;
	}

	public void setFarmland(double farmland) {
		this.farmland = farmland;
	}

	public int getLaborNum() {
		return laborNum;
	}

	public void setLaborNum(int laborNum) {
		this.laborNum = laborNum;
	}

	public double getYearIncome() {
		return yearIncome;
	}

	public void setYearIncome(double yearIncome) {
		this.yearIncome = yearIncome;
	}

	public double getPlanAidFinance() {
		return planAidFinance;
	}

	public void setPlanAidFinance(double planAidFinance) {
		this.planAidFinance = planAidFinance;
	}

	public String getIncomeMainSource() {
		return incomeMainSource;
	}

	public void setIncomeMainSource(String incomeMainSource) {
		this.incomeMainSource = incomeMainSource;
	}

	public String getCurrentCropsDetail() {
		return currentCropsDetail;
	}

	public void setCurrentCropsDetail(String currentCropsDetail) {
		this.currentCropsDetail = currentCropsDetail;
	}

	public int getCurrentCropsAcre() {
		return currentCropsAcre;
	}

	public void setCurrentCropsAcre(int currentCropsAcre) {
		this.currentCropsAcre = currentCropsAcre;
	}

	public String getPlanCropsDetail() {
		return planCropsDetail;
	}

	public void setPlanCropsDetail(String planCropsDetail) {
		this.planCropsDetail = planCropsDetail;
	}

	public String getPlanCropsAcre() {
		return planCropsAcre;
	}

	public void setPlanCropsAcre(String planCropsAcre) {
		this.planCropsAcre = planCropsAcre;
	}

	public long getUpdateId() {
		return updateId;
	}

	public void setUpdateId(long updateId) {
		this.updateId = updateId;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	// select limit ? ? farmer0_.ID_ as col_0_0_, farmer0_.FARMER_NAME as
	// col_1_0_, farmer0_.PHONE_NO as col_2_0_, farmer0_.INCOME as col_3_0_,
	// farmer0_.ID_NO as col_4_0_, farmer0_.COOPERATIVE_DEBT as col_5_0_,
	// farmer0_.ADDRESS as col_6_0_, farmer0_.STATUS as col_7_0_ from LC_FARMER
	// farmer0_ order by farmer0_.CRT_DATE desc

}
