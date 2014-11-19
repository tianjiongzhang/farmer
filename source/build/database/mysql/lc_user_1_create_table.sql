#########################################################################
## 用户模块
#########################################################################

#
# 用户表：LC_USER
#
drop table if exists LC_USER;
create table LC_USER (
  ID bigint(10) not null auto_increment,
  DELETED char(1) not null,   
  CREATOR_ID bigint(10) not null,
  CREATE_DATE timestamp not null,
  STATUS char(1) not null,    
  EMAIL varchar(48) not null,
  NICKNAME varchar(32) not null,  
  PASSWORD varchar(16) not null,
  primary key (ID)
);

alter table LC_USER auto_increment = 1;