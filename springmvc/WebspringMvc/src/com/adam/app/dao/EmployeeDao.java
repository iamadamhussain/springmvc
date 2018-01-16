package com.adam.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adam.app.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	private SessionFactory factory;
	
	public Employee save(Employee employee)
	{
		Session session=  factory.openSession();
		Transaction transaction=   session.beginTransaction();
		transaction.begin();
		
		session.save(employee);
		transaction.commit();
		session.close();
		
		return employee;
		
		
		
		
	}
	
	

}
