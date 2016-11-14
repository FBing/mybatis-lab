
CREATE DATABASE `admin` default charset utf8 COLLATE utf8_general_ci;

CREATE TABLE `tb_user` (
  `id` BIGINT(12) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NOT NULL,
  `password` VARCHAR(20) NOT NULL,
  `role` VARCHAR(20) NOT NULL,
  `create_time` DATETIME NOT NULL,
  `modify_time` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_index`(`name`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


CREATE DATABASE `trade` default charset utf8 COLLATE utf8_general_ci;

CREATE TABLE `tb_order` (
  `id` BIGINT(12) NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT(12) NOT NULL,
  `category` VARCHAR(20) NOT NULL,
  `total_price` DECIMAL(8,2) NOT NULL,
  `amount` INT (4) NOT NULL,
  `address` VARCHAR(40) NOT NULL,
  `status` SMALLINT(2) NOT NULL DEFAULT '0',
  `create_time` DATETIME NOT NULL,
  `modify_time` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_index`(`user_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
