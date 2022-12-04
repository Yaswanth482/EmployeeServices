package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.DeptRepository;

import java.util.List;

@Service
public class DeptServices {
	
	@Autowired
	DeptRepository deptRepository;
	
	public Employee deptService(Employee employee) {
		
		Employee e=deptRepository.save(employee);
		
		return e;
	}
	public List<Employee> getEmployee(String id)
	{
		List<Employee> e = deptRepository.findByPublished(id);
	return e;
	}

}
