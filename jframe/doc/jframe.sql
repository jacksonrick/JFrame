/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50716
 Source Host           : localhost
 Source Database       : jframe

 Target Server Type    : MySQL
 Target Server Version : 50716
 File Encoding         : utf-8

 Date: 08/20/2017 17:05:40 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `s_admin`
-- ----------------------------
DROP TABLE IF EXISTS `s_admin`;
CREATE TABLE `s_admin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `role_id` bigint(20) NOT NULL COMMENT '用户组id',
  `admin_name` varchar(32) NOT NULL COMMENT '用户名',
  `admin_realname` varchar(16) DEFAULT NULL COMMENT '真实姓名',
  `admin_password` varchar(32) DEFAULT NULL COMMENT '登录密码',
  `admin_phone` varchar(16) DEFAULT NULL COMMENT '手机号',
  `admin_create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '账号创建日期',
  `admin_login_time` datetime DEFAULT NULL COMMENT '上次登录时间',
  `admin_login_ip` varchar(64) DEFAULT NULL COMMENT '上次登录ip',
  `admin_flag` tinyint(2) DEFAULT '1' COMMENT '是否可编辑 1-可编辑 0-不可编辑',
  `is_delete` bit(1) DEFAULT b'0' COMMENT '是否删除 1-是 0-否',
  PRIMARY KEY (`id`),
  UNIQUE KEY `t_admin_username` (`admin_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10003 DEFAULT CHARSET=utf8 COMMENT='后台管理员';

-- ----------------------------
--  Records of `s_admin`
-- ----------------------------
BEGIN;
INSERT INTO `s_admin` VALUES ('10000', '10000', 'admin', '超管', 'c4ca4238a0b923820dcc509a6f75849b', '17730215422', '2016-04-23 15:36:55', '2017-08-20 16:53:33', '127.0.0.1', '0', b'0'), ('10001', '10001', 'huang', '老黄', 'c4ca4238a0b923820dcc509a6f75849b', '17732125421', '2016-05-13 10:58:17', '2016-05-21 09:50:49', null, '1', b'0'), ('10002', '10002', 'zhang', '老张', 'c4ca4238a0b923820dcc509a6f75849b', '17730215512', '2016-05-13 11:37:13', null, null, '1', b'0');
COMMIT;

-- ----------------------------
--  Table structure for `s_log`
-- ----------------------------
DROP TABLE IF EXISTS `s_log`;
CREATE TABLE `s_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `log_user` varchar(64) DEFAULT NULL COMMENT '操作人',
  `log_remark` varchar(128) DEFAULT NULL COMMENT '备注',
  `log_ip` varchar(32) DEFAULT NULL COMMENT 'ip',
  `log_params` varchar(255) DEFAULT NULL COMMENT '参数',
  `log_create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=517 DEFAULT CHARSET=utf8 COMMENT='日志表';

-- ----------------------------
--  Records of `s_log`
-- ----------------------------
BEGIN;
INSERT INTO `s_log` VALUES ('485', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-05-09 14:10:43'), ('486', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-05-09 14:40:44'), ('487', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-05-09 15:19:13'), ('488', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-05-09 15:38:31'), ('489', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-05-09 16:31:59'), ('490', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-05-09 16:45:05'), ('491', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-05-09 16:48:35'), ('492', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-05-09 17:24:33'), ('493', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-05-10 09:11:13'), ('494', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-05-10 09:15:34'), ('495', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-05-11 09:24:54'), ('496', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-05-11 15:50:08'), ('497', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-05-23 09:30:50'), ('498', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-05-24 10:25:57'), ('499', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-05-25 13:54:16'), ('500', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-06-07 16:12:35'), ('501', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-06-24 17:09:59'), ('502', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-07-28 18:08:57'), ('503', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-08-20 15:53:14'), ('504', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-08-20 16:04:02'), ('505', 'admin', '禁用/启用用户', '127.0.0.1', 'id=10012', '2017-08-20 16:36:02'), ('506', 'admin', '禁用/启用用户', '127.0.0.1', 'id=10010', '2017-08-20 16:39:08'), ('507', 'admin', '禁用/启用用户', '127.0.0.1', 'id=10008', '2017-08-20 16:39:23'), ('508', 'admin', '禁用/启用用户', '127.0.0.1', 'id=10000', '2017-08-20 16:39:35'), ('509', 'admin', '管理员登录', '127.0.0.1', 'username=admin', '2017-08-20 16:53:33'), ('510', 'admin', '禁用/启用用户', '127.0.0.1', 'id=10011', '2017-08-20 16:54:45'), ('511', 'admin', '禁用/启用用户', '127.0.0.1', 'id=10009', '2017-08-20 16:54:58'), ('512', 'admin', '禁用/启用用户', '127.0.0.1', 'id=10007', '2017-08-20 16:55:41'), ('513', 'admin', '禁用/启用用户', '127.0.0.1', 'id=10012', '2017-08-20 16:55:57'), ('514', 'admin', '禁用/启用用户', '127.0.0.1', 'id=10011', '2017-08-20 16:56:05'), ('515', 'admin', '禁用/启用管理员', '127.0.0.1', 'id=10001', '2017-08-20 16:58:37'), ('516', 'admin', '禁用/启用管理员', '127.0.0.1', 'id=10001', '2017-08-20 16:59:58');
COMMIT;

-- ----------------------------
--  Table structure for `s_module`
-- ----------------------------
DROP TABLE IF EXISTS `s_module`;
CREATE TABLE `s_module` (
  `id` int(11) NOT NULL COMMENT 'id',
  `parent_id` int(11) DEFAULT NULL COMMENT '父模块id 0表示一级分类',
  `mod_name` varchar(64) DEFAULT NULL COMMENT '模块名',
  `mod_path` varchar(128) DEFAULT NULL COMMENT '访问action',
  `mod_icon` varchar(128) DEFAULT NULL COMMENT '模块图标',
  `mod_flag` tinyint(2) DEFAULT NULL COMMENT '1,2表示层级 | 3表示功能',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台模块';

-- ----------------------------
--  Records of `s_module`
-- ----------------------------
BEGIN;
INSERT INTO `s_module` VALUES ('10000', '0', '用户管理', null, 'fa fa-user', '1'), ('10100', '10000', '会员列表', 'admin/user/userList.do', 'fa fa-group', '2'), ('10110', '10100', '用户数据', 'admin/user/userListData.do', null, '3'), ('10111', '10100', '用户编辑', 'admin/user/userEdit.do', null, '3'), ('10112', '10100', '用户禁用/解封', 'admin/user/userEnable.do', null, '3'), ('10113', '10100', '用户详情', 'admin/user/userDetail.do', null, '3'), ('10114', '10100', '导出用户Excel', 'admin/user/exportUserExcel.do', null, '3'), ('20000', '0', '系统管理', null, 'fa fa-gear', '1'), ('20100', '20000', '管理员列表', 'admin/system/adminList.do', 'fa fa-user', '2'), ('20110', '20100', '管理员编辑', 'admin/system/adminEdit.do', null, '3'), ('20111', '20100', '管理员冻结', 'admin/system/adminEnable.do', null, '3'), ('20200', '20000', '权限管理', 'admin/system/rights.do', 'fa fa-delicious', '2'), ('20201', '20200', '编辑组', 'admin/system/roleEdit.do', null, '3'), ('20202', '20200', '禁用/启用组', 'admin/system/roleEnable.do', null, '3'), ('20203', '20200', '查看权限', 'admin/system/rolePerm.do', null, '3'), ('20204', '20200', '授权组', 'admin/system/permit.do', null, '3'), ('20300', '20000', '日志管理', 'admin/system/logList.do', 'fa fa-laptop', '2'), ('20301', '20300', '日志备份', 'admin/system/backupLog.do', null, '3'), ('20400', '20000', '文件管理', 'admin/system/file.do', 'fa fa-archive', '2'), ('20401', '20400', '获取目录', 'admin/system/getDirectory.do', null, '3'), ('20500', '20000', '系统工具', 'admin/system/tools.do', 'fa fa-crop', '2'), ('20501', '20500', 'SQL编辑', 'admin/system/executeUpdate.do', null, '3'), ('20502', '20500', 'SQL查询', 'admin/system/executeQuery.do', null, '3'), ('20600', '20000', '地址管理', 'admin/system/address.do', 'fa fa-map', '2'), ('20601', '20600', '编辑地址', 'admin/system/addrEdit.do', null, '3'), ('20602', '20600', '删除地址', 'admin/system/addrDel.do', null, '3');
COMMIT;

-- ----------------------------
--  Table structure for `s_role`
-- ----------------------------
DROP TABLE IF EXISTS `s_role`;
CREATE TABLE `s_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `role_name` varchar(16) DEFAULT NULL COMMENT '用户组名称',
  `role_rights` varchar(1024) DEFAULT NULL COMMENT '权限',
  `role_flag` tinyint(2) DEFAULT '1' COMMENT '是否可编辑 1-可编辑 0-不可编辑',
  `is_delete` bit(1) DEFAULT b'0' COMMENT '是否删除 1-是 0-否',
  PRIMARY KEY (`id`),
  UNIQUE KEY `t_role_name` (`role_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10003 DEFAULT CHARSET=utf8 COMMENT='后台用户组';

-- ----------------------------
--  Records of `s_role`
-- ----------------------------
BEGIN;
INSERT INTO `s_role` VALUES ('10000', '超级管理组', '10000,10100,10110,10111,10112,10113,10114,20000,20100,20110,20111,20200,20201,20202,20203,20204,20300,20301,20400,20401,20500,20501,20502,20600,20601,20602', '0', b'0'), ('10001', '财务组', null, '1', b'1'), ('10002', '运维组', null, '1', b'0');
COMMIT;

-- ----------------------------
--  Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `nickname` varchar(32) DEFAULT NULL COMMENT '昵称',
  `phone` varchar(16) DEFAULT NULL COMMENT '手机号',
  `email` varchar(32) DEFAULT NULL COMMENT '邮箱',
  `password` varchar(32) DEFAULT NULL COMMENT '密码',
  `avatar` varchar(128) DEFAULT NULL COMMENT '头像',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `last_login_time` datetime DEFAULT NULL COMMENT '最近登陆时间',
  `realname` varchar(16) DEFAULT NULL COMMENT '真实姓名',
  `idcard` varchar(32) DEFAULT NULL COMMENT '身份证号码',
  `gender` bit(1) DEFAULT b'1' COMMENT '性别 1-男 0-女',
  `address` varchar(64) DEFAULT NULL COMMENT '住址',
  `birthday` varchar(32) DEFAULT NULL COMMENT '出生日期',
  `is_delete` bit(1) DEFAULT b'0' COMMENT '是否删除 1-是 0-否(默认)',
  PRIMARY KEY (`id`),
  UNIQUE KEY `t_user_phone` (`phone`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10013 DEFAULT CHARSET=utf8 COMMENT='用户';

-- ----------------------------
--  Records of `t_user`
-- ----------------------------
BEGIN;
INSERT INTO `t_user` VALUES ('10000', 'fei', '15515556993', '11@qq.com', 'c4ca4238a0b923820dcc509a6f75849b', '/static/upload/images/201601/test.jpg', '2016-09-27 17:53:50', '2016-12-21 13:29:21', '11', '340123199311012774', b'0', '安徽省/合肥市/瑶海区', '2016-12-21', b'1'), ('10001', 'feifei', '17730215423', '22@qq.com', 'c4ca4238a0b923820dcc509a6f75849b', '/static/upload/images/201601/test.jpg', '2016-09-27 11:04:17', null, '22', '340123199311012774', b'1', null, null, b'0'), ('10002', 'feifeifei', '17734901234', '33@qq.com', 'c4ca4238a0b923820dcc509a6f75849b', '/static/upload/images/201601/test.jpg', '2016-10-14 15:04:06', null, '22', '340123199311012774', b'1', '安徽省/合肥市/瑶海区', null, b'1'), ('10003', 'test1', '17734901231', '44@qq.com', 'c4ca4238a0b923820dcc509a6f75849b', '/static/upload/images/201601/test.jpg', '2017-04-20 16:35:11', null, '44', '340123199311012774', b'1', null, '2016-12-21', b'0'), ('10004', 'test2', '17734901232', '55@qq.com', 'c4ca4238a0b923820dcc509a6f75849b', '/static/upload/images/201601/test.jpg', '2017-06-07 16:13:24', null, '55', '340123199311012774', b'1', '安徽省/合肥市/瑶海区', null, b'0'), ('10005', 'test3', '17734901233', '66@qq.com', 'c4ca4238a0b923820dcc509a6f75849b', '/static/upload/images/201601/test.jpg', '2017-06-07 16:13:27', null, '22', '340123199311012774', b'1', null, null, b'0'), ('10006', 'test4', '17734901235', '77@qq.com', 'c4ca4238a0b923820dcc509a6f75849b', '/static/upload/images/201601/test.jpg', '2017-06-07 16:13:29', null, '66', '340123199311012774', b'1', null, '2016-12-21', b'0'), ('10007', 'test5', '17734901236', '88@qq.com', 'c4ca4238a0b923820dcc509a6f75849b', '/static/upload/images/201601/test.jpg', '2017-06-07 16:13:32', null, '33', '340123199311012774', b'1', '安徽省/合肥市/瑶海区', null, b'1'), ('10008', 'test6', '17734901237', '99@qq.com', 'c4ca4238a0b923820dcc509a6f75849b', '/static/upload/images/201601/test.jpg', '2017-06-07 16:13:34', null, '33', '340123199311012774', b'1', null, '2016-12-21', b'1'), ('10009', 'test7', '17734901238', '00@qq.com', 'c4ca4238a0b923820dcc509a6f75849b', '/static/upload/images/201601/test.jpg', '2017-06-07 16:13:37', null, '77', '340123199311012774', b'1', '安徽省/合肥市/瑶海区', null, b'1'), ('10010', 'test8', '17734901239', '111@qq.com', 'c4ca4238a0b923820dcc509a6f75849b', '/static/upload/images/201601/test.jpg', '2017-06-07 16:13:39', null, '44', '340123199311012774', b'1', null, '2016-12-21', b'1'), ('10011', 'test9', '17734901200', '222@qq.com', 'c4ca4238a0b923820dcc509a6f75849b', '/static/upload/images/201601/test.jpg', '2017-06-07 16:13:42', null, '88', '340123199311012774', b'1', '安徽省/合肥市/瑶海区', null, b'0'), ('10012', 'test10', '17734901321', '333@qq.com', 'c4ca4238a0b923820dcc509a6f75849b', '/static/upload/images/201601/test.jpg', '2017-06-07 16:13:44', null, '55', '340123199311012774', b'1', null, '2016-12-21', b'0');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
