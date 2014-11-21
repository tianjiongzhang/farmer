#########################################################################
## 基金会模块
#########################################################################

#
# 项目定义表：LC_USER
#
DROP TABLE IF EXISTS LC_PROJECT;
CREATE TABLE  LC_PROJECT (
  project_id bigint(15) NOT NULL AUTO_INCREMENT,
  PROJECT_NAME varchar(50) ,
  COOPERATION_ID bigint(115) ,
  STATUS varchar(10) ,
  CREATOR_ID bigint(15) ,
  CREATE_DATE datetime ,
  PRIMARY KEY (project_id)
);