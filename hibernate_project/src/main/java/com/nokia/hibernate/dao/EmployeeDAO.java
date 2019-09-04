package com.nokia.hibernate.dao;

import com.nokia.hibernate.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee getEmployee(String firstName, String lastName);

    void add(Employee employee);

    void update(Employee employee);

    void delete(Employee employee);

    Employee findById(int id);

    void deleteAll();

}
