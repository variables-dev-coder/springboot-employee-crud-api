package com.munna.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.munna.employee.model.Employee;
import com.munna.employee.repository.EmployeeRepository;
import java.util.List;


@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	 @Autowired
	    private EmployeeRepository employeeRepository;

	    // Create
	    @PostMapping
	    public Employee createEmployee(@RequestBody Employee employee) {
	        return employeeRepository.save(employee);
	    }

	    // Read All
	    @GetMapping
	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    // Read by ID
	    @GetMapping("/{id}")
	    public Employee getEmployeeById(@PathVariable Long id) {
	        return employeeRepository.findById(id).orElse(null);
	    }

	    // Update
	    @PutMapping("/{id}")
	    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
	        Employee employee = employeeRepository.findById(id).orElse(null);
	        if (employee != null) {
	            employee.setName(employeeDetails.getName());
	            employee.setDepartment(employeeDetails.getDepartment());
	            employee.setSalary(employeeDetails.getSalary());
	            return employeeRepository.save(employee);
	        }
	        return null;
	    }

	    // Delete
	    @DeleteMapping("/{id}")
	    public String deleteEmployee(@PathVariable Long id) {
	        employeeRepository.deleteById(id);
	        return "Employee with ID " + id + " deleted.";
	    }

}
