#########################################################################
## 用户模块
#########################################################################

#
# 用户表：LC_USER
#
DROP TABLE IF EXISTS LC_USER;
CREATE TABLE LC_USER (
  ID BIGINT(15) not NULL AUTO_INCREMENT COMMENT '用户ID',
  DELETED VARCHAR(1)   COMMENT '删除标志',   
  CREATOR_ID BIGINT(15)   COMMENT '创建人',
  CREATE_DATE DATETIME  COMMENT '状态',    
  EMAIL VARCHAR(48)   COMMENT '电子邮箱',
  NICKNAME VARCHAR(32)   COMMENT '用户名',  
  PASSWORD VARCHAR(16)   COMMENT '密码',
  PRIMARY KEY (ID)
) COMMENT '用户定义表';