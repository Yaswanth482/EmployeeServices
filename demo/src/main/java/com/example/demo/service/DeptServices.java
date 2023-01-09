package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.DeptRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DeptServices {

	@Autowired
	DeptRepository deptRepository;

	public Employee deptService(Employee employee) {

		Employee e = deptRepository.save(employee);

		return e;
	}

	public List<Employee> getEmployee(String eName) {

		List<Employee> e1 = deptRepository.findByPublished(eName);

		return e1;
	}
	
	public List<Employee> getAllEmployee(){
		return deptRepository.findAll();
	}

	public Employee saveOrUpdate(Employee employee) {
		return deptRepository.save(employee);

	}

	public void deleteEmployeeById(Long id) {
		deptRepository.deleteById(id);

	}

	public Optional<Employee> getEmployeeById(Long id) {
		Optional<Employee> e2 = deptRepository.findById(id);
		return e2;
	}

}
