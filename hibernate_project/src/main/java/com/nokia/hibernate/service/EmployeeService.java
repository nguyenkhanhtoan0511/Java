package com.nokia.hibernate.service;

import com.nokia.hibernate.dao.EmployeeDAO;
import com.nokia.hibernate.dao.impl.EmployeeDAOImpl;
import com.nokia.hibernate.entity.Employee;

import java.util.List;

public class EmployeeService {
    private static EmployeeDAOImpl employeeDAOImpl;

    public EmployeeService(){
        this.employeeDAOImpl = new EmployeeDAOImpl();
    }

    public List<Employee> findAll(){
        employeeDAOImpl.openCurrentSession();
        List<Employee> employees = employeeDAOImpl.findAll();
        employeeDAOImpl.closeCurrentSession();
        return employees;
    }


    public void add(Employee employee){
        employeeDAOImpl.openCurrentSessionwithTransaction();
        employeeDAOImpl.add(employee);
        employeeDAOImpl.closeCurrentSessionwithTransaction();
    }

    public void update(Employee employee){
        employeeDAOImpl.openCurrentSessionwithTransaction();
        employeeDAOImpl.update(employee);
        employeeDAOImpl.closeCurrentSessionwithTransaction();
    }

    public void delete(Employee employee){
        employeeDAOImpl.openCurrentSessionwithTransaction();
        employeeDAOImpl.delete(employee);
        employeeDAOImpl.closeCurrentSessionwithTransaction();
    }

    public Employee findById(int id){
        employeeDAOImpl.openCurrentSession();
        Employee employee = employeeDAOImpl.findById(id);
        employeeDAOImpl.closeCurrentSession();
        return employee;
    }

    public Employee getEmployee(String firstName, String lastName){
        employeeDAOImpl.openCurrentSession();
        Employee employee = employeeDAOImpl.getEmployee(firstName, lastName);
        employeeDAOImpl.closeCurrentSession();
        return employee;
    }


    public void deleteAll(){
        employeeDAOImpl.openCurrentSessionwithTransaction();
        employeeDAOImpl.deleteAll();
        employeeDAOImpl.closeCurrentSessionwithTransaction();
    }


}
