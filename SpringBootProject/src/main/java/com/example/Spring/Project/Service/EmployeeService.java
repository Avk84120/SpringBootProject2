package com.example.Spring.Project.Service;

import java.beans.JavaBean;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.Spring.Project.entity.Employee;
import com.example.Spring.Project.Service.EmployeeService;


@JavaBean
@Transactional

@Service 
public interface EmployeeService {
	public Employee createEmp(Employee emp);
	public List<Employee> getEmployees();
	public Employee getEmployee(int id);
	public Employee updateEmp(Employee emp,int id);
	public void deleteEmp(int id);

}
