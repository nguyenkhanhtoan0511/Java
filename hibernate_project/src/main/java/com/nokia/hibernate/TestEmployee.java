package com.nokia.hibernate;

import com.nokia.hibernate.entity.Employee;
import com.nokia.hibernate.service.EmployeeService;

import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

//        employeeService.deleteAll();

        Employee employee1 = new Employee("toan", "nk", 102);
        Employee employee2 = new Employee("nguyen", "khanh toan", 500);
        Employee employee3 = new Employee("loc", "nguyen", 1000);
        Employee employee4 = new Employee("ada", "nafaf", 0);
        Employee employee5 = new Employee("toan", "nk", 112);

        employeeService.add(employee1);
        employeeService.add(employee2);
        employeeService.add(employee3);
        employeeService.add(employee4);
        employeeService.add(employee5);

        System.out.println("List employee: ");
        List<Employee> listEmployee = employeeService.findAll();
        for(Employee e:listEmployee){
            System.out.println(e.toString());
        }

        Employee employeeId1 = employeeService.findById(27);
        System.out.println("Employee id 1: ");
        System.out.println(employeeId1.toString());

        Employee employeeId28 = employeeService.findById(28);
        System.out.println(employeeId28);
        if(employeeId28 != null){
            employeeService.delete(employeeId28);
        }else{
            System.out.println("Can't find Artist for ID");
        }

        System.out.println("After delete employee id 4");
        List<Employee> listEmployees1 = employeeService.findAll();
        for(Employee e: listEmployees1){
            System.out.println(e.toString());
        }

        Employee employeeId31 = employeeService.findById(31);
        employeeId31.setLastName("update");
        employeeId31.setFirstName("employee 31");
        employeeId31.setSalary(33333);
        employeeService.update(employeeId31);

        System.out.println("List employees: ");
        List<Employee> listEmployees2 = employeeService.findAll();
        for(Employee e: listEmployees2){
            System.out.println(e.toString());
        }

    }
}
