create database imooc_homepage_sc;

CREATE TABLE `homepage_course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `course_name` varchar(128) NOT NULL DEFAULT '' COMMENT '课程名称',
  `course_type` varchar(128) NOT NULL DEFAULT '' COMMENT '课程类型',
  `course_icon` varchar(128) NOT NULL DEFAULT '' COMMENT '课程图标',
  `course_intro` varchar(128) NOT NULL DEFAULT '' COMMENT '课程介绍',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 08:00:00' COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 08:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `key_course_name` (`course_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课程表';

CREATE TABLE `homepage_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `username` varchar(128) NOT NULL DEFAULT '' COMMENT '用户名',
  `email` varchar(128) NOT NULL DEFAULT '' COMMENT '用户邮箱',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 08:00:00' COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 08:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `key_username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

CREATE TABLE `homepage_user_course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `user_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '用户id',
  `course_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '课程id',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 08:00:00' COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 08:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `key_user_course` (`user_id`,`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户课程表';