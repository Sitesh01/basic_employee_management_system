package org.siteshkumar.basic_employee_management_system.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeModel {
    private Long Id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String phone;
}