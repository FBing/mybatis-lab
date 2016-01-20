
CREATE TABLE `dict_author` (
  `id` BIGINT(12) NOT NULL AUTO_INCREMENT,
  `uid` varchar(16) NOT NULL,
  `nickname` varchar(20) NOT NULL,
  `gender` smallint(2) NOT NULL,
  `birthday` varchar(40) DEFAULT NULL,
  `email` varchar(40) NOT NULL,
  `register_time` varchar(64) DEFAULT NULL,
  `status` smallint(2) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `user_index`(`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `dict_blog` (
  `id` BIGINT(12) NOT NULL AUTO_INCREMENT,
  `title` varchar(80) NOT NULL,
  `content` TEXT NOT NULL,
  `section_id` BIGINT(12) NOT NULL,
  `uid` BIGINT(12) NOT NULL,
  `publish_time` varchar(64) NOT NULL,
  `update_time` varchar(64) DEFAULT NULL,
  `status` smallint(2) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `blog_index`(`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `dict_comment` (
  `id` BIGINT(12) NOT NULL AUTO_INCREMENT,
  `title` varchar(80) NOT NULL,
  `content` TEXT NOT NULL,
  `blog_id` BIGINT(12) NOT NULL,
  `uid` BIGINT(12) NOT NULL,
  `publish_time` varchar(64) DEFAULT NULL,
  `status` smallint(2) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `comment_index`(`blog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `dict_section` (
  `id` BIGINT(12) NOT NULL AUTO_INCREMENT,
  `name` varchar(80) NOT NULL,
  `parent_id` BIGINT(12) NOT NULL,
  `create_time` varchar(64) DEFAULT NULL,
  `status` smallint(2) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
