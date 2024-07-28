package org.employee.employee_management_system;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmpController {

    List<Employee> employees = new ArrayList<>();

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employees;
    }
    
    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        employees.add(employee);
        return "Saved Successfully";
    }
    
}
