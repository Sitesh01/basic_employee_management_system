package org.siteshkumar.basic_employee_management_system.Service;

import java.util.ArrayList;
import java.util.List;

import org.siteshkumar.basic_employee_management_system.Entity.EmployeeEntity;
import org.siteshkumar.basic_employee_management_system.Model.EmployeeModel;
import org.siteshkumar.basic_employee_management_system.Repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService{

    @Autowired
    private EmployeeRepository empRep;

    @Override
    public String createEmployee(EmployeeModel employee) {
        EmployeeEntity empEntity = new EmployeeEntity();

        BeanUtils.copyProperties(employee, empEntity);
        empRep.save(empEntity);

        return "Saved Successfully !";
    }

    @Override
    public List<EmployeeModel> readEmployees() {
        List<EmployeeEntity> empEntity = empRep.findAll();

        List<EmployeeModel> result = new ArrayList<>();
        for(EmployeeEntity emp : empEntity){
            EmployeeModel empModel = new EmployeeModel();

            empModel.setId(emp.getId());
            empModel.setFirstName(emp.getFirstName());
            empModel.setLastName(emp.getLastName());
            empModel.setEmailId(emp.getEmailId());
            empModel.setPhone(emp.getPhone());

            result.add(empModel);
        }
        return result;
    }

    @Override
    public EmployeeModel readEmployeeById(Long id) {
        EmployeeEntity empEntity = empRep.findById(id).get();

        EmployeeModel empModel = new EmployeeModel();
        BeanUtils.copyProperties(empEntity, empModel);

        return empModel;
    }

    @Override
    public String updateEmployee(Long id, EmployeeModel employee) {
        EmployeeEntity empEntity = empRep.findById(id).get();

        empEntity.setFirstName(employee.getFirstName());
        empEntity.setLastName(employee.getLastName());
        empEntity.setEmailId(employee.getEmailId());
        empEntity.setPhone(employee.getPhone());

        empRep.save(empEntity);
        return "Updated Successfully !";

    }

    @Override
    public boolean deleteEmployee(Long id) {
        EmployeeEntity empEntity = empRep.findById(id).get();
        empRep.delete(empEntity);
        return true;
    }
}
