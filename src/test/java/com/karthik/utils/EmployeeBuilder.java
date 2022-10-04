package com.karthik.utils;

import com.karthik.dto.EmployeeDTO;
import com.karthik.entity.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeBuilder {
    public static List<EmployeeDTO> getListDTO() {

        return Arrays.asList(new EmployeeDTO(1,"karthik","rajan",25,"chennai"),
                new EmployeeDTO(2,"siva","kumar",63,"saali"));
    }

    public static List<Employee> getListEntities() {
        return Arrays.asList(new Employee(1,"karthik","rajan",25,"chennai"),
                new Employee(2,"siva","kumar",63,"saali"),
                new Employee(3,"siva","bhagya",50,"sivangai"));
    }

    public static EmployeeDTO getDTO() {
        return new EmployeeDTO(1,"karthik","rajan",25,"chennai");
    }

    public static Employee getEntity() {
        return new Employee(1,"karthik","rajan",25,"chennai");
    }
}
