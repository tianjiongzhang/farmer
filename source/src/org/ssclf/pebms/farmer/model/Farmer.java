package org.ssclf.pebms.farmer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

import org.ssclf.pebms.base.model.BaseEntity;

@Entity(name = "LC_FARMER")
public class Farmer extends BaseEntity {

	
	@Column(name = "farmer_Name")
	private String farmerName;
	
	@Column(name = "id_no")
	private String idNo;
	@Column
	private String sex;
	@Column
	private int age;
	
	@Column(name = "phone_no")
	private String phoneNo;
	@Column
	private String address;
	
	@Column(name = "cooperative_debt")
	private String cooperativeDebt;
	@Column
	private Double farmLand;
	@Column
	private int laborNum;
	@Column
	private Double yearIncome;
	
	@Column(name = "planAid_Finance")
	private String planAidFinance;
	
	@Column(name = "income_MainSource")
	private String incomeSource;
	
	@Column(name = "current_CropsDetail")
	private String currentCropsDetail;
	
	@Column(name = "current_CropsAcre")
	private String currentCropsAcre;
	
	@Column(name = "plan_CropsAcre")
	private String planCropsAcre;
	
	@Column(name = "plan_CropsDetail")
	private String planCropsDetail;
    
	@Column(name ="remark")
	private String remark;

	public String getFarmerName() {
		return farmerName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
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

	public String getCooperativeDebt() {
		return cooperativeDebt;
	}

	public void setCooperativeDebt(String cooperativeDebt) {
		this.cooperativeDebt = cooperativeDebt;
	}

	public Double getFarmLand() {
		return farmLand;
	}

	public void setFarmLand(Double farmLand) {
		this.farmLand = farmLand;
	}

	public int getLaborNum() {
		return laborNum;
	}

	public void setLaborNum(int laborNum) {
		this.laborNum = laborNum;
	}

	public Double getYearIncome() {
		return yearIncome;
	}

	public void setYearIncome(Double yearIncome) {
		this.yearIncome = yearIncome;
	}

	public String getPlanAidFinance() {
		return planAidFinance;
	}

	public void setPlanAidFinance(String planAidFinance) {
		this.planAidFinance = planAidFinance;
	}

	public String getIncomeSource() {
		return incomeSource;
	}

	public void setIncomeSource(String incomeSource) {
		this.incomeSource = incomeSource;
	}

	public String getCurrentCropsDetail() {
		return currentCropsDetail;
	}

	public void setCurrentCropsDetail(String currentCropsDetail) {
		this.currentCropsDetail = currentCropsDetail;
	}

	public String getCurrentCropsAcre() {
		return currentCropsAcre;
	}

	public void setCurrentCropsAcre(String currentCropsAcre) {
		this.currentCropsAcre = currentCropsAcre;
	}

	public String getPlanCropsAcre() {
		return planCropsAcre;
	}

	public void setPlanCropsAcre(String planCropsAcre) {
		this.planCropsAcre = planCropsAcre;
	}

	public String getPlanCropsDetail() {
		return planCropsDetail;
	}

	public void setPlanCropsDetail(String planCropsDetail) {
		this.planCropsDetail = planCropsDetail;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
