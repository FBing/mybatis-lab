
CREATE TABLE `tb_user` (
  `id` BIGINT(12) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NOT NULL,
  `password` VARCHAR(20) NOT NULL,
  `age` SMALLINT(3) NOT NULL,
  `email` VARCHAR(40) NOT NULL,
  `gender` SMALLINT(2) NOT NULL DEFAULT '0',
  `register_time` DATETIME NOT NULL,
  `status` SMALLINT(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `user_index`(`name`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
