
CREATE TABLE `dict_user` (
  `id` BIGINT(12) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `age` smallint(3) NOT NULL,
  `email` varchar(40) NOT NULL,
  `gender` SMALLINT(2) NOT NULL,
  `status` smallint(2) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `user_index`(`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
