package com.hefshine.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.bean.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ApplicationContext  con=new ClassPathXmlApplicationContext("config1.xml");
	
	Employee emp=(Employee) con.getBean("e1");
		
		emp.work();
		
		
	}

}
