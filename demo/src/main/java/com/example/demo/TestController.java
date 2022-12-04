package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Employee;
import com.example.demo.service.DeptServices;

import java.util.List;

@RestController
// this is controller class
public class TestController {
	
	@Autowired
	DeptServices deptServices;
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee e) {
		System.out.println("testing call...");
		
		return deptServices.deptService(e);
	}

	@GetMapping("/get/{id}")
	public List<Employee> getEmployeeDetails(@PathVariable String  id)
	{
	return deptServices.getEmployee(id);
	}
	

}
