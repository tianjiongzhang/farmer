#########################################################################
## �����ģ��
#########################################################################

#
# ��Ŀ�����LC_USER
#
DROP TABLE IF EXISTS LC_PROJECT;
CREATE TABLE  LC_PROJECT (
  project_id bigint(20) NOT NULL AUTO_INCREMENT,
  PROJECT_NAME varchar(50) ,
  COOPERATION_ID bigint(20) ,
  STATUS varchar(10) ,
  CREATOR_ID bigint(20) ,
  CREATE_DATE TIMESTAMP ,
  PRIMARY KEY (project_id)
);
ALTER TABLE LC_PROJECT AUTO_INCREMENT = 1;