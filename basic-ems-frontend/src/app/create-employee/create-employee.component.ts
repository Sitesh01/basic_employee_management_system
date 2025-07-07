import { Component } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent {

  employee : Employee = new Employee();

  constructor(private emp : EmployeeService){ }

  ngOnInit() : void {
    
  }

  onSubmit() {
  this.emp.createEmployee(this.employee).subscribe({
    next: (response: string) => {
      if (response === "Saved Successfully !") {
        alert("Employee data saved Successfully");
      } else {
        alert("There is some error while saving data");
      }
    },
    error: (err) => {
      console.error(err);
      alert("Something went wrong");
    }
  });
}
}
