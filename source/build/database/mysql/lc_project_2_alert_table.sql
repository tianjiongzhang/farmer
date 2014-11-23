#########################################################################
## 基金会模块
#########################################################################

#
# 项目定义表： LC_PROJECT
#
ALTER TABLE LC_PROJECT ADD AMOUNT DOUBLE(10,2)  COMMENT '项目投入金额' ;
ALTER TABLE LC_PROJECT ADD START_TIME DATETIME  COMMENT '计划开始时间' ;
ALTER TABLE LC_PROJECT ADD START_TIME DATETIME  COMMENT '计划开始时间' ;
ALTER TABLE LC_PROJECT ADD VOLUNTEER_FEE DOUBLE(2,2)  COMMENT '志愿者费用比率' ;
ALTER TABLE LC_PROJECT ADD COOPERATION_FEE DOUBLE(2,2)  COMMENT '志愿者费用比率'; 