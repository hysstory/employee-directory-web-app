package com.hysstory.projectone.dao;

import com.hysstory.projectone.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

// @RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByOrderByLastNameAsc();
}
