
CREATE TABLE `dict_author` (
  `id` BIGINT(12) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(20) NOT NULL,
  `age` smallint(3) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `email` varchar(40) NOT NULL,
  `status` smallint(2) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `user_index`(`nickname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `dict_blog` (
  `id` BIGINT(12) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `content` TEXT NOT NULL,
  `create_time` varchar(64) NOT NULL,
  `update_time` varchar(64) DEFAULT NULL,
  `author_id` BIGINT(12) NOT NULL,
  `status` smallint(2) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `blog_index`(`author_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `dict_comment` (
  `id` BIGINT(12) NOT NULL AUTO_INCREMENT,
  `content` TEXT NOT NULL,
  `blog_id` BIGINT(12) NOT NULL,
  `create_time` varchar(64) DEFAULT NULL,
  `status` smallint(2) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `comment_index`(`blog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

###
初始化数据
INSERT INTO dict_author(nickname,age,gender,email) VALUES('ricky', 26, '男', 'ricky_feng@163.com');

INSERT INTO dict_blog(title,content,create_time,author_id) VALUES('mybatis测试', "测试标记", '2016-04-25 14:37:55', 1);

INSERT INTO dict_comment(content,create_time,blog_id) VALUES('非常感谢LZ分享', '2016-04-25 14:37:45', 1);

