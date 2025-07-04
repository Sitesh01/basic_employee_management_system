import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseURL = "http://localhost:8080/api/v1/employees";

  constructor(private http : HttpClient) { }

  getEmployeesList() : Observable<Employee[]> {
    return this.http.get<Employee[]>(`${this.baseURL}`);
  }
}
