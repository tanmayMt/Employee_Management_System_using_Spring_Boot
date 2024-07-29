package org.employee.employee_management_system;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmpController {

    //List<Employee> employees = new ArrayList<>();

    //EmployeeService employeeService = new EmployeeServiceImpl();
    //Dependcy Injection
    EmployeeService employeeService;   // EmpController is depending on EmployeeService.ioc contaner will resposiable for creating object.

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employeeService.readEmployee();
    }
    
    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        //employees.add(employee);
        employeeService.createEmployee(employee);
        return "Saved Successfully";
    }
    
}
