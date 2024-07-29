package org.employee.employee_management_system;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    List<Employee> readEmployee();
    boolean deleteEmployee(Long id);
}
