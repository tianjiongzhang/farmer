#########################################################################
## 合作社模块
#########################################################################

#
# 农户定义表：LC_PROJECT
#
DROP TABLE IF EXISTS LC_FARMER;
CREATE TABLE LC_FARMER (
  farmer_Id BIGINT(10) AUTO_INCREMENT COMMENT '主键，农户ID',
  farmer_Name varchar(20)  COMMENT '农户姓名',
  id_no varchar(20)  COMMENT '身份证号码',
  sex varchar(2)    COMMENT '性别',
  age int(5)    COMMENT '年龄',
  phone_no varchar(20)  COMMENT '电话',
  address varchar(50)  COMMENT '地址',
  cooperative_debt double(10,0)  COMMENT '在合作社的欠款或赊账金额',
  Chief_rela varchar(10)  COMMENT '与社长关系',
  farmland double(5,0)  COMMENT '可耕地面积（亩）',
  laborNum int(5)  COMMENT '劳动力个数',
  yearIncome double(10,0)   COMMENT '年收入',
  planAid_Finance double(10,0)  COMMENT '',
  income_MainSource varchar(20)    COMMENT '家庭主要收入来源',
  current_CropsDetail varchar(20)    COMMENT '当前农作物描述',
  current_CropsAcre int(5)    COMMENT '当前主要农作物亩数',
  plan_CropsDetail varchar(20)    COMMENT '计划的种植农作物描述',
  plan_CropsAcre varchar(5)   COMMENT '计划种植或者养殖的农作物亩数',
  STATUS VARCHAR(10) COMMENT '状态',
  CREATOR_ID BIGINT(15) COMMENT '创建人',
  CREATE_DATE DATETIME COMMENT '创建时间',
  UPDATE_ID BIGINT(15) COMMENT '更新人',
  UPDATE_DATE DATETIME COMMENT '更新时间',    
  PRIMARY KEY (farmer_Id)
) COMMENT '农户表';

