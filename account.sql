/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : accountmjy

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2016-11-10 18:20:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `comCode` varchar(200) NOT NULL,
  `cname` varchar(100) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `lastLoginTime` datetime DEFAULT NULL,
  `accountType` varchar(100) DEFAULT NULL,
  `state` int(10) DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', '00001', '库存现金', '2016-11-17 13:59:45', '2016-11-30 13:59:50', '基本存款', '0', '因办理日常转账结算和现金收付需要开立的银行结算账户。');
INSERT INTO `account` VALUES ('2', '00002', '银行存款', '2016-11-16 13:13:25', '2016-11-29 14:49:40', '一般存款', '1', '存款人的工资、奖金等现金的支取，只能通过基本存款账户办理。');
INSERT INTO `account` VALUES ('3', '00003', '应收账款', '2016-11-16 13:13:25', '2016-11-29 14:49:40', '临时存款', '1', '基本存款账户开户银行以外的银行营业机构开立的银行结算账户。');
INSERT INTO `account` VALUES ('4', '00004', '其他应收款', '2016-11-16 13:13:25', '2016-11-29 14:49:40', '临时存款', '1', '基本存款账户开户银行以外的银行营业机构开立的银行结算账户');
INSERT INTO `account` VALUES ('5', '00005', '累计折旧', '2016-11-16 13:13:25', '2016-11-29 14:49:40', '专用存款', '1', '针对特定事项开立的存款账户.');
INSERT INTO `account` VALUES ('6', '00006', '固定资产', '2016-11-16 13:13:25', '2016-11-29 14:49:40', '基本存款', '1', '固定资产的存储');
INSERT INTO `account` VALUES ('7', '00007', '短期借款', '2016-11-16 13:13:25', '2016-11-29 14:49:40', '临时存款', '1', '客户欠取的短期借款');
INSERT INTO `account` VALUES ('8', '00008', '应付利息', '2016-11-16 13:13:25', '2016-11-29 14:49:40', '一般存款', '1', '存取的是应交的利息');
INSERT INTO `account` VALUES ('9', '00009', ' 实收资本', '2016-11-16 13:13:25', '2016-11-29 14:49:40', '一般存款', '1', '应该收客户的资产');
INSERT INTO `account` VALUES ('10', '00010', '应交税费', '2016-11-16 13:13:25', '2016-11-29 14:49:40', '临时存款', '1', '企业应该交的税费');
