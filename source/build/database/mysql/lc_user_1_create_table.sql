#########################################################################
## �û�ģ��
#########################################################################

#
# �û���LC_USER
#
DROP TABLE IF EXISTS LC_USER;
CREATE TABLE LC_USER (
  ID BIGINT(15) not NULL AUTO_INCREMENT COMMENT '�û�ID',
  DELETED VARCHAR(1)   COMMENT 'ɾ����־',   
  CREATOR_ID BIGINT(15)   COMMENT '������',
  CREATE_DATE DATETIME  COMMENT '״̬',    
  EMAIL VARCHAR(48)   COMMENT '��������',
  NICKNAME VARCHAR(32)   COMMENT '�û���',  
  PASSWORD VARCHAR(16)   COMMENT '����',
  PRIMARY KEY (ID)
) COMMENT '�û������';