package com.ricky.codelab.mybatis.sample.mapper;

import com.ricky.codelab.mybatis.sample.model.Author;

public interface AuthorMapper {

	public Author selectAuthorById(long id);
}
