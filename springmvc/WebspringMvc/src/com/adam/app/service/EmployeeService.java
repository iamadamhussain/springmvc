package com.adam.app.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.adam.app.Employee;
import com.adam.app.dao.EmployeeDao;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	public Employee save(Employee employee)
	{
	Employee employee2=	dao.save(employee);
		return employee2;
		
	}
	
	

}
