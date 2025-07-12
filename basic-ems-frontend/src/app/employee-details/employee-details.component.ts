import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { ActivatedRoute } from '@angular/router';
import { Employee } from '../employee';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent {

  id! : number;
  employee! : Employee;

  constructor(private ems : EmployeeService, private route : ActivatedRoute) {}

  ngOnInit() {
    this.id = this.route.snapshot.params['id'];

    this.employee = new Employee();
    this.ems.getEmployeeById(this.id).subscribe(data => {
      this.employee = data;
    });
  }
}
