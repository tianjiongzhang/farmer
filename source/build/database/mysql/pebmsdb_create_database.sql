#########################################################################
## 创建数据库 PEBMSDB
#########################################################################
DROP DATABASE IF EXISTS PEBMSDB;
CREATE DATABASE PEBMSDB;



## 创建数据库用户 pebmsopr，密码123456
GRANT ALL ON PEBMSDB.* TO pebmsopr@localhost identified by "123456";

USE PEBMSDB;