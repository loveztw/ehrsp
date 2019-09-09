DROP TABLE  IF EXISTS `ehrsp`.`cml_user`;
CREATE TABLE `ehrsp`.`cml_user` (
  `userid` VARCHAR(64) NOT NULL COMMENT '用户id',
  `mobile` VARCHAR(16) NOT NULL COMMENT '电话号码',
  `mail` VARCHAR(45) NULL COMMENT '邮箱地址',
  `mail_auth` INT NOT NULL DEFAULT 0 COMMENT '邮箱是否认证，0：没有认证，1：已认证',
  `username` VARCHAR(64) NOT NULL COMMENT '用户名',
  `password` VARCHAR(64) NOT NULL COMMENT '密码，base64加密',
  `loging_time` DATETIME NULL COMMENT '用户最近登录时间',
  `update_time` DATETIME NULL COMMENT '记录最近更新时间',
  `create_time` DATETIME NULL COMMENT '记录创建时间',
  PRIMARY KEY (`userid`),
  UNIQUE INDEX `mobile_UNIQUE` (`mobile` ASC) VISIBLE)
  DEFAULT CHARACTER SET = utf8;

DROP TABLE  IF EXISTS `ehrsp`.`cml_sms_verify_code`;
CREATE TABLE `ehrsp`.`cml_sms_verify_code` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `userid` VARCHAR(64) COMMENT '用户id',
  `mobile` VARCHAR(16) COMMENT '电话号码',
  `verify_code` CHAR(5) NOT NULL,
  `update_time` DATETIME NOT NULL,
  `create_time` DATETIME NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;