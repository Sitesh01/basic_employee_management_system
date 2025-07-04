package org.siteshkumar.basic_employee_management_system.Controller;

import java.util.List;

import org.siteshkumar.basic_employee_management_system.Model.EmployeeModel;
import org.siteshkumar.basic_employee_management_system.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
    
    @Autowired
    EmployeeService empService;

    @GetMapping("/employees")
    public List<EmployeeModel> getAllEmployees(){
        return empService.readEmployees();
    }

    @GetMapping("/employees/{id}")
    public EmployeeModel getEmployeeById(@PathVariable Long id){
        return empService.readEmployeeById(id);
    }

    @PostMapping("/employees")
    public String createEmployee(@RequestBody EmployeeModel empModel){
        return empService.createEmployee(empModel);
    }

    @PutMapping("/employees/{id}")
    public String updateEmployee(@PathVariable Long id, @RequestBody EmployeeModel empModel){
        return empService.updateEmployee(id, empModel);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        if(empService.deleteEmployee(id))
            return "Deleted Successfully !";
        return "Employee not found !";
    }
}
