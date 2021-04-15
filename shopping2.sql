/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 5.6.16 : Database - shopping
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`shopping` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `shopping`;

/*Table structure for table `footprint` */

DROP TABLE IF EXISTS `footprint`;

CREATE TABLE `footprint` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `productid` int(11) DEFAULT NULL,
  `datetimes` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user` (`userid`),
  KEY `pro` (`productid`),
  CONSTRAINT `user` FOREIGN KEY (`userid`) REFERENCES `users` (`id`),
  CONSTRAINT `pro` FOREIGN KEY (`productid`) REFERENCES `product` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4;

/*Data for the table `footprint` */

insert  into `footprint`(`id`,`userid`,`productid`,`datetimes`) values 
(1,1,935,'2019-09-11 09:09:14'),
(2,3,934,'2019-09-11 10:31:18'),
(3,2,935,'2019-09-11 13:09:04'),
(4,3,935,'2019-09-11 13:48:48'),
(5,1,934,'2019-09-11 13:50:47'),
(6,2,934,'2019-09-11 13:51:37'),
(7,3,934,'2019-09-11 13:51:50'),
(8,2,934,'2019-09-11 13:55:22'),
(9,3,934,'2019-09-11 13:58:58'),
(10,3,935,'2019-09-11 14:01:52'),
(11,1,938,'2019-09-11 14:05:44');

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varbinary(100) NOT NULL,
  `categoryid` int(11) DEFAULT NULL,
  `explain` text,
  `generalexplain` varbinary(255) DEFAULT NULL,
  `discount` int(11) DEFAULT NULL,
  `shopprice` decimal(8,0) DEFAULT NULL,
  `price` decimal(8,0) DEFAULT NULL,
  `externalid` varbinary(100) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `hot` int(11) DEFAULT NULL,
  `productstatus` int(11) DEFAULT NULL,
  `inventoryflag` int(11) DEFAULT NULL,
  `defaultimg` varbinary(255) DEFAULT NULL,
  `updatetime` datetime DEFAULT NULL,
  `updateuser_id` int(11) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `createuser_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `update` (`updateuser_id`),
  KEY `create` (`createuser_id`),
  CONSTRAINT `update` FOREIGN KEY (`updateuser_id`) REFERENCES `users` (`id`),
  CONSTRAINT `create` FOREIGN KEY (`createuser_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=940 DEFAULT CHARSET=utf8mb4;

/*Data for the table `product` */

insert  into `product`(`id`,`name`,`categoryid`,`explain`,`generalexplain`,`discount`,`shopprice`,`price`,`externalid`,`quantity`,`hot`,`productstatus`,`inventoryflag`,`defaultimg`,`updatetime`,`updateuser_id`,`createtime`,`createuser_id`) values 
(933,'新鲜冬枣 1500g 礼盒装 大荔冬枣 水果礼盒    新鲜水果 冬枣 顺丰快递发货 3�',1,'新鲜冬枣 1500g 礼盒装 大荔冬枣 水果礼盒    新鲜水果 冬枣 顺丰快递发货 3斤礼盒装',NULL,2000,14700,19600,NULL,1997,1,0,0,'/resources/upload/c05f7df2362d49399d78262637f03eb9.jpg','2016-10-30 08:26:05',1,'2016-10-30 08:26:05',3),
(934,'寻真水果 山东烟台栖霞红富士苹果16-24个 5kg 新鲜水果',1,'寻真水果 山东烟台栖霞红富士苹果16-24个 5kg 新鲜水果',NULL,2000,7350,9800,NULL,1994,1,0,0,'/resources/upload/2ad834a8448d4d839d9f1f64b6ee8fea.jpg','2016-10-30 08:26:05',1,'2016-10-30 08:26:05',3),
(935,'缤咕果园 海南红心火龙果6斤装约7个大果 红肉吉祥果新鲜水果',1,'缤咕果园 海南红心火龙果6斤装约7个大果 红肉吉祥果新鲜水果',NULL,2000,9750,13000,NULL,1993,1,0,0,'/resources/upload/b1600afee99a43cd83539acf67c65212.jpg','2016-10-30 08:26:05',1,'2016-10-30 08:26:05',3),
(936,'鲜游记 琯溪蜜白肉蜜柚 2个装 约2.5kg 福建平和新鲜柚子',1,'鲜游记 琯溪蜜白肉蜜柚 2个装 约2.5kg 福建平和新鲜柚子',NULL,2000,3600,4800,NULL,2000,0,0,0,'/resources/upload/64ccd6b3061c4025bc26860171614e78.jpg','2016-10-30 08:26:05',1,'2016-10-30 08:26:05',3),
(937,'新鲜冬枣 1500g 礼盒装 大荔冬枣 水果礼盒    新鲜水果 冬枣 顺丰快递发货 5�',1,'新鲜冬枣 1500g 礼盒装 大荔冬枣 水果礼盒    新鲜水果 冬枣 顺丰快递发货 5斤礼盒装',NULL,2000,24000,32000,NULL,2000,0,0,0,'/resources/upload/df93dc6afdcc46129519733d3d53fe1b.jpg','2016-10-30 08:26:05',1,'2016-10-30 08:26:05',3),
(938,'寻真水果 山东莱阳丰水梨黄金梨子 2.5kg 新鲜水果',1,'寻真水果 山东莱阳丰水梨黄金梨子 2.5kg 新鲜水果',NULL,2000,3600,4800,NULL,1999,0,0,0,'/resources/upload/22f0bbb7272448f3941a8c9a57148a39.jpg','2016-10-30 08:26:05',1,'2016-10-30 08:26:05',3),
(939,'缤咕果园 云南蒙自甜石榴 新鲜水果 散装10斤实惠装',1,'缤咕果园 云南蒙自甜石榴 新鲜水果 散装10斤实惠装',NULL,2000,11250,15000,NULL,2000,0,0,0,'/resources/upload/7dd89272867b463d9e00ed7536e527f0.jpg','2016-10-30 08:26:05',1,'2016-10-30 08:26:05',3);

/*Table structure for table `productcategory` */

DROP TABLE IF EXISTS `productcategory`;

CREATE TABLE `productcategory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varbinary(50) NOT NULL,
  `sortorder` int(11) DEFAULT NULL,
  `description` text,
  `image` varbinary(255) DEFAULT NULL,
  `updatetime` datetime DEFAULT NULL,
  `updateuserid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `updateuser` (`updateuserid`),
  CONSTRAINT `updateuser` FOREIGN KEY (`updateuserid`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;

/*Data for the table `productcategory` */

insert  into `productcategory`(`id`,`name`,`sortorder`,`description`,`image`,`updatetime`,`updateuserid`) values 
(1,'水果类',997,'计算机语言（Computer Language）指用于人与计算机之间通讯的语言。计算机语言是人与计算机之间传递信息的媒介。计算机系统最大特征是指令通过一种语言传达给机器。为了使电子计算机进行各种工作，就需要有一套用以编写计算机程序的数字、字符和语法规划，由这些字符和语法规则组成计算机各种指令（或各种语句）。这些就是计算机能接受的语言。','/resources/upload/c68b08f0e98749f999b01f0430ac8050.jpg','2016-11-08 14:56:19',3),
(2,'蔬菜蛋类',2,'蔬菜蛋类','','2019-09-11 08:19:14',3),
(3,'肉禽类',3,'肉禽类生活类','/resources/upload/7b3e182cbfd7408d92bc043c65754d8b.png','2019-09-11 08:18:53',3),
(4,'男装',999,'冬季男装新款上市','/resources/upload/0ad766e56d844d0d895e4be5607c434c.jpg','2016-11-08 14:54:49',3),
(5,'女装',998,'女装','/resources/upload/801d7e1430a74f97839b3ca1ea415a3e.jpg','2016-11-08 14:49:38',3),
(6,'童装',996,'童装新品上市','/resources/upload/600611bebf564002bdaf416950661f62.jpg','2016-11-08 14:57:08',3),
(7,'运动鞋类',996,'运动鞋类','/resources/upload/11aac404300f4e8fa2a4e5f483bc9874.jpg','2016-11-08 14:58:04',3),
(8,'休闲类',995,'休闲类','/resources/upload/85a0e5828aaa47de899362d58c2afa5a.jpg','2016-11-08 14:58:31',3),
(9,'家居',993,'家居生活类','/resources/upload/fd61b589349e4c3cb111c2a692729360.jpg','2019-09-11 08:18:38',3),
(10,'鞋帽类',1000,'鞋帽类商品类别','/resources/upload/bf309fc6792b4a8a99dd5d52ea77de55.png','2019-09-11 08:18:01',3),
(11,'电子类',1001,'电子类商品类别','','2019-09-11 08:17:43',3),
(12,'软件类',1002,'软件类商品类别','','2019-09-11 08:17:28',3),
(13,'家电类',1005,'家电类商品类别','','2019-09-11 08:17:13',3),
(14,'鞋子',1,'男女潮鞋品质类','','2019-09-11 08:19:31',3);

/*Table structure for table `productimage` */

DROP TABLE IF EXISTS `productimage`;

CREATE TABLE `productimage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productid` int(11) NOT NULL,
  `url` varbinary(255) DEFAULT NULL,
  `explain` text,
  `updatetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `productimage` */

/*Table structure for table `userroles` */

DROP TABLE IF EXISTS `userroles`;

CREATE TABLE `userroles` (
  `userroleid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varbinary(45) NOT NULL,
  `role` varbinary(45) NOT NULL,
  PRIMARY KEY (`userroleid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `userroles` */

insert  into `userroles`(`userroleid`,`username`,`role`) values 
(1,'管理员','1'),
(2,'用户','1');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `pwd` varchar(100) NOT NULL,
  `nickname` varbinary(50) DEFAULT NULL,
  `email` varbinary(50) NOT NULL,
  `enabled` int(2) DEFAULT NULL,
  `openid` varbinary(50) DEFAULT NULL,
  `oauthtype` varbinary(50) DEFAULT NULL,
  `image` varbinary(255) DEFAULT NULL,
  `lastlogintime` datetime DEFAULT NULL,
  `registertime` datetime DEFAULT NULL,
  `CREATEDAT` datetime DEFAULT NULL,
  `userroleid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fr_roles` (`userroleid`),
  CONSTRAINT `fr_roles` FOREIGN KEY (`userroleid`) REFERENCES `userroles` (`userroleid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`pwd`,`nickname`,`email`,`enabled`,`openid`,`oauthtype`,`image`,`lastlogintime`,`registertime`,`CREATEDAT`,`userroleid`) values 
(1,'admin','admin','管理员','151515151@163.com',1,'1','1','01.jpg','2021-04-06 20:58:56','2021-04-06 20:58:56',NULL,1),
(2,'zhangsan','123456','张三','151515151@163.com',1,'1','1','01.jpg','2021-04-06 20:58:56','2021-04-07 21:02:46',NULL,2),
(3,'lisi','123456','李四','151515151@163.com',1,'1','1','02.jpg','2021-03-03 21:03:30','2020-07-15 21:03:35','2041-04-13 21:03:45',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
