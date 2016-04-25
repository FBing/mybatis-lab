package com.ricky.codelab.mybatis.sample.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import com.ricky.codelab.mybatis.sample.model.Author;

public interface IAuthorDao {

	@Select("select *from dict_author")
    public List<Author> retrieveAllUsers();
	
	@Select("select * from dict_author where id = #{id}")
	public Author selectAuthorById(long id);
	
}
