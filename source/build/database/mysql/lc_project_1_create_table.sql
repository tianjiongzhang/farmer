#########################################################################
## �����ģ��
#########################################################################

#
# ��Ŀ�����LC_PROJECT
#
DROP TABLE IF EXISTS LC_PROJECT;
CREATE TABLE  LC_PROJECT (
  project_id BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT '��ĿID�������ֶ�',
  PROJECT_NAME VARCHAR(50) COMMENT '��Ŀ����',
  COOPERATION_ID BIGINT(115) COMMENT '������ID',
  STATUS VARCHAR(10) COMMENT '��Ŀ״̬',
  CREATOR_ID BIGINT(15) COMMENT '������',
  CREATE_DATE DATETIME COMMENT '����ʱ��',
  UPDATE_ID BIGINT(15) COMMENT '������',
  UPDATE_DATE DATETIME COMMENT '����ʱ��',  
  PRIMARY KEY (project_id)
) COMMENT '��Ŀ�����';