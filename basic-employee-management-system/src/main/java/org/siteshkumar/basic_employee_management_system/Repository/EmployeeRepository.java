package org.siteshkumar.basic_employee_management_system.Repository;

import org.siteshkumar.basic_employee_management_system.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{
    // We can make custom method here.
    // Otherwise no need to write anything here.
    // Like: findbyName(), findbyAge() anything else you can make it from here.
}
