package com.ricky.codelab.mybatis.sample.mapper;

import com.ricky.codelab.mybatis.sample.model.Blog;

public interface BlogMapper {

	public Blog selectBlogById(long id);
}
