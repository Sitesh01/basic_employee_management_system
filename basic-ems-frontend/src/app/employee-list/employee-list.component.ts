import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})

export class EmployeeListComponent implements OnInit {
  employees : Employee[] = [];

  constructor(private ems : EmployeeService, private router : Router) {}

  ngOnInit(): void {
    this.getEmployees();
  }

  private getEmployees(){
    this.ems.getEmployeesList().subscribe( data => {
      this.employees = data;
    });
  }

   updateEmployee(id : number){
    this.router.navigate(['update-employee', id ]);
  }

  deleteEmployee(id: number){
    this.ems.deleteEmployee(id).subscribe ({
      next: (response : boolean) => {
        if (response) {
          alert("Employee data is deleted successfully");
          this.router.navigate(['employee', id ]);
          this.getEmployees();
        } else {
          alert("Employee data not deleted");
        }
      }
    }
  )}

  employeeDetails(id: number){
    this.router.navigate(['employee-details', id ]);
  }
}
