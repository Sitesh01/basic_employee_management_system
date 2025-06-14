package org.siteshkumar.basic_employee_management_system.Service;

import java.util.List;

import org.siteshkumar.basic_employee_management_system.Model.EmployeeModel;

public interface EmployeeService {
    public String createEmployee(EmployeeModel employee);
    List<EmployeeModel> readEmployees();
    EmployeeModel readEmployeeById(Long id);
    String updateEmployee(Long id, EmployeeModel employee);
    boolean deleteEmployee(Long id);
}
