import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent {

  id! : number;
  employee : Employee = new Employee();

  constructor(private ems : EmployeeService, private route : ActivatedRoute) {}

  ngOnInit() : void {
    this.id = this.route.snapshot.params['id'];
    this.ems.getEmployeeById(this.id).subscribe(data => {
      this.employee = data;
    }); 
  }

  onSubmit() {
    this.ems.updateEmployee(this.id, this.employee).subscribe({
      next: (response: string) => {
        if (response === "Updated Successfully !") {
          alert("Employee data updated Successfully");
        } else {
          alert("There is some error while updating data");
        }
      }
    });
  }
}
