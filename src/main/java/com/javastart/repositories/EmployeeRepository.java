package com.javastart.repositories;


import com.javastart.model.Employee;
import org.springframework.data.repository.CrudRepository;

interface EmployeeRepository extends CrudRepository<Employee, Long> { }