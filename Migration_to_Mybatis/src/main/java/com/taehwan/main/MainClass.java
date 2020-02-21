package com.taehwan.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.taehwan.beans.JdbcBean;
import com.taehwan.config.BeanConfigClass;
import com.taehwan.mapper.MapperInterface;

public class MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MapperInterface mapper = context.getBean("test_mapper", MapperInterface.class);
		
		System.out.println("@ MapperInterface Test" + mapper);
		
		//INSERT
		JdbcBean bean2 = new JdbcBean();
			bean2.setInt_data(1);
			bean2.setStr_data("TEST CONTENTS");
			bean2.setWriter("TEST");
			mapper.insert_data(bean2);

		//UPDATE
		JdbcBean bean3 = new JdbcBean();
		bean3.setInt_data(2);
		bean3.setWriter("ET");
		mapper.update_data(bean3);

		//DELETE
		mapper.delete_data(2);
		
		//SELECT
		List<JdbcBean> list1 = mapper.select_data();
		for(JdbcBean bean1 : list1) {
			System.out.println("=================");
			System.out.println("@ NO       : " + bean1.getInt_data());
			System.out.println("@ CONTENTS : " + bean1.getStr_data());
			System.out.println("@ WRITER   : " + bean1.getWriter());
			System.out.println("=================");
		}
		
		context.close();
	}
}
