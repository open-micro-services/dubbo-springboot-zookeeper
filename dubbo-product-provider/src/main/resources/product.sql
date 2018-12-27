/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2018-12-27 02:44:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `categroy` varchar(30) NOT NULL,
  `price` decimal(9,2) DEFAULT NULL,
  `discount` decimal(2,1) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('af647c76-37af-49cd-93ff-cb041c986011', 'PRO-ITEM-2018-1315403508', 'DRUG', '0.61', '7.5', 'Chengdu,Sichuan,China');
INSERT INTO `product` VALUES ('e4f27f60-032e-44ab-817d-e30da3ead542', 'PRO-ITEM-2018-java.util.Random@503df2d0', 'DRUG', '0.41', '7.5', 'Chengdu,Sichuan,China');
