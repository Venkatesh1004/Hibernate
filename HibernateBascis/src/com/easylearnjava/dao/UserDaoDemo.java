package com.easylearnjava.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.easylearnjava.dto.UserDtoDemo;
import com.easylearnjava.utill.HibernateUtillDemo;

public class UserDaoDemo {
	 
public static void main(String[] args) {
		
		HibernateUtillDemo util = new HibernateUtillDemo();
		Session session = util.getSession();	
		
		/*SQLQuery query = session.createSQLQuery("select * from user");
		query.addEntity(UserDtoDemo.class);
		List<UserDtoDemo> userList =  query.list();
		*/
		
			
			List<UserDtoDemo> userList = session.createQuery("from UserDtoDemo").list();
			for(UserDtoDemo obj: userList){
				System.out.println(obj);
		}
			String password = (String)session.createQuery("select usr.password from UserDtoDemo usr where usr.uname='pasham' ").uniqueResult();
		
		    System.out.println("Password :" + password);

}

}