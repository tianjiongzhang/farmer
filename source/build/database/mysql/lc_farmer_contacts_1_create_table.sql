## 合作社模块
#########################################################################

#
# 农户联系人：LC_PROJECT
#
-- ----------------------------
DROP TABLE IF EXISTS LC_FARMER_CONTACTS;

CREATE TABLE LC_FARMER_CONTACTS (
  contacts_id BIGINT(15) AUTO_INCREMENT COMMENT '联系人ID',
  farmer_id BIGINT(15)  COMMENT '农户ID',
  contacts_name varchar(20) COMMENT '联系人姓名',
  contacts_sex varchar(2) COMMENT '联系人性别',
  contacts_age int(5) COMMENT '联系人年龄',
  relaitonship varchar(5) COMMENT '与农户关系',
  PRIMARY KEY (contacts_id)
) COMMENT '农户联系人表';

