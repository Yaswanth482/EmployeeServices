package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Employee;
import com.example.demo.repository.DeptRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	DeptRepository dept;
	
	@Test
	public void testCreate() {
		Employee e = new Employee();
		e.setId(1L);
		e.setTitle("yaswanth");
		e.setPublished("SC");
		e.setDescription("LE");
		dept.save(e);
		
		assertNotNull(dept.findById(1L).get());
		
	}
	@Test
	public void testReadAll() {
//		Employee e = new Employee();
//		e.setId(1L);
//		e.setTitle("yaswanth");
//		e.setPublished("SC");
//		e.setDescription("LE");
//		dept.save(e);
//		
//		Employee e1 = new Employee();
//		e1.setId(2L);
//		e1.setTitle("sumanth");
//		e1.setPublished("cse");
//		e1.setDescription("aiml");
//		dept.save(e1);
		
		
		List<Employee> list = dept.findAll();
		System.out.println("printing value of list:"+ list.size());
		assertThat(list).size().isGreaterThan(0);
		
	}
}
