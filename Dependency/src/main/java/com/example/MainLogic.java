package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("spring.xml");
		BeanFactory f = new XmlBeanFactory(r);
		Journey x=(Journey)f.getBean("pune");
		x.startJourney();
	}

}
