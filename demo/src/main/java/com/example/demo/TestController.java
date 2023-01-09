package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Employee;
import com.example.demo.service.DeptServices;

import java.util.List;
import java.util.Optional;

@RestController
public class TestController {

	@Autowired
	DeptServices deptServices;

	@PostMapping("/create")
	public Employee testCall(@RequestBody Employee e) {
		System.out.println("testing call...");

		return deptServices.deptService(e);
	}

	@GetMapping("/get/{id}")
	public List<Employee> getEmployee(@PathVariable("id") String eName) {

		return deptServices.getEmployee(eName);
	}

	@GetMapping("/get")
	public Optional<Employee> getEmployeeById(@RequestParam("id") Long id) {
		System.out.println("newget.........");
		return deptServices.getEmployeeById(id);
	}
	
	@GetMapping("/get")
	public Employee getEmployeeByName(@RequestParam("name") String name) {
		System.out.println("newget.........");
		return deptServices.getEmployeeByName(name);
	}

	public Employee updateEmployee(@RequestBody Employee employee) {
		System.out.println("update.........");
		return deptServices.saveOrUpdate(employee);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable("id") Long id) {
		System.out.println("delete.........");
		deptServices.deleteEmployeeById(id);

	}
	@DeleteMapping("/delete/{id}")
	public void deleteEmployeeName(@PathVariable("id") Long id) {
		System.out.println("delete.........");
		deptServices.deleteEmployeeById(id);

	}
	@DeleteMapping("/delete/{id}")
	public void deleteEmployeeEmail(@PathVariable("id") Long id) {
		System.out.println("delete.........");
		deptServices.deleteEmployeeById(id);

	}
}
