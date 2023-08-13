package com.luv2code.cruddemo.rest;

import com.luv2code.cruddemo.dao.EmployeeDAO;
import com.luv2code.cruddemo.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeDAO employeeDAO;
//    quick and dirty: inject   dao
    public EmployeeRestController(EmployeeDAO theEmployeeDao) {
        employeeDAO = theEmployeeDao;
    }
//    expose "/employees" and return a list of employee
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }


}
