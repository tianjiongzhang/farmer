#########################################################################
## 基金会模块
#########################################################################

#
# 项目定义表：LC_PROJECT
#
DROP TABLE IF EXISTS LC_PROJECT;
CREATE TABLE  LC_PROJECT (
  project_id BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT '项目ID，主键字段',
  PROJECT_NAME VARCHAR(50) COMMENT '项目名称',
  COOPERATION_ID BIGINT(115) COMMENT '合作社ID',
  STATUS VARCHAR(10) COMMENT '项目状态',
  CREATOR_ID BIGINT(15) COMMENT '创建人',
  CREATE_DATE DATETIME COMMENT '创建时间',
  UPDATE_ID BIGINT(15) COMMENT '更新人',
  UPDATE_DATE DATETIME COMMENT '更新时间',  
  PRIMARY KEY (project_id)
) COMMENT '项目定义表';