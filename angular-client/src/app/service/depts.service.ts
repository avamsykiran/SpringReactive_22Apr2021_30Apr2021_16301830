import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Dept } from '../model/dept';

@Injectable({
  providedIn: 'root'
})
export class DeptsService {

  deptUrl :string = "http://localhost:9999/depts";

  constructor(private httpClient : HttpClient) { }

  getAll() :Observable<Dept[]>{
    return this.httpClient.get<Dept[]>(this.deptUrl);
  }
}
