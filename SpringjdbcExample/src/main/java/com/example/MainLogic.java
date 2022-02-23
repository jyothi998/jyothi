package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ct= new ClassPathXmlApplicationContext("spring.xml");
SpringJdbcSelect sj=ct.getBean(SpringJdbcSelect.class);
//sj.insert();
sj.selectEx();

	}

}
