package com.taehwan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.taehwan.beans.JdbcBean;

public interface MapperInterface {
 
	
	  @Results({
		  @Result(column = "int_data", property = "int_data"),
		  @Result(column = "str_data", property = "str_data"),
		  @Result(column = "writer", property = "writer") 
	  })
	 	 
	@Select("SELECT int_data, str_data, writer FROM jdbc_table")
	List<JdbcBean> select_data();

	@Insert("INSERT INTO jdbc_table(int_data, str_data, writer)"
			+ "values(#{int_data}, #{str_data}, #{writer})")
	public void insert_data(JdbcBean bean);
	
	@Update("UPDATE jdbc_table SET writer = #{writer} WHERE int_data=#{int_data}")
	public void update_data(JdbcBean bean);
	
	@Delete("DELETE FROM jdbc_table WHERE int_data= #{int_data}")
	void delete_data(int int_data);
	
	
}
