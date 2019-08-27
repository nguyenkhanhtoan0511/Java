package com.nokia.java.JUnit;

public class BusinessEmployee {
    public double calculatorSalaryPerYear(EmployeeDetail employeeDetail){
        double result = 0;

        result += employeeDetail.getSalary() *12;

        return result;
    }

    public int raise(EmployeeDetail employeeDetail){
        int raise = 0;

        if(employeeDetail.getSalary()>1000){
            raise = 100;
        }else{
            raise = 50;
        }

        return raise;
    }

}
