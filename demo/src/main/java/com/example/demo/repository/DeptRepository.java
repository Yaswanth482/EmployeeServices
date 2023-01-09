package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeptRepository extends JpaRepository<Employee, Long>{

	List<Employee> findByPublished(String eName);

	void deleteById(Long id);

	 Optional<Employee> findById(Long id);
}