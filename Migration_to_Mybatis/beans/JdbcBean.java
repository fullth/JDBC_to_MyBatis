package com.taehwan.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component //개발자가 직접 클래스를 등록할 때 @Component 어노테이션을 사용한다.
@Scope("prototype")
//VO, DTO part.
//Must matching with field variable and Column Name
public class JdbcBean {
	private int int_data;
	private String str_data;
	private String writer;
	
	public int getInt_data() {
		return int_data;
	}
	public void setInt_data(int int_data) {
		this.int_data = int_data;
	}
	public String getStr_data() {
		return str_data;
	}
	public void setStr_data(String str_data) {
		this.str_data = str_data;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}

}
