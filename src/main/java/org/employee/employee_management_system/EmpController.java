package org.employee.employee_management_system;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmpController {

    //List<Employee> employees = new ArrayList<>();

    //EmployeeService employeeService = new EmployeeServiceImpl();
    //Dependcy Injection
    // @Autowired
    EmployeeService employeeService;   // EmpController is depending on EmployeeService.ioc contaner will resposiable for creating object.

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employeeService.readEmployees();
    }
    
    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        //employees.add(employee);
        return employeeService.createEmployee(employee);
        //return "Saved Successfully";
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        if (employeeService.deleteEmployee(id))
            return "Deleted Succesfully";
        return "Not Found";
    }
}
