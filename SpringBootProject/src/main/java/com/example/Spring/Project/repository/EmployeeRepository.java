package com.example.Spring.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring.Project.entity.Employee;




public interface EmployeeRepository extends JpaRepository <Employee,Integer>{

}
