package org.employee.employee_management_system;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmpController {
    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(null);
        Employee emp = new Employee();
        emp.setName("Shivam");
        employees.add(emp);
        return employees;
    }
    
}
