#########################################################################
## �������ݿ� PEBMSDB
#########################################################################
DROP DATABASE IF EXISTS PEBMSDB;
CREATE DATABASE PEBMSDB;



## �������ݿ��û� pebmsopr������123456
GRANT ALL ON PEBMSDB.* TO pebmsopr@localhost identified by "123456";

USE PEBMSDB;