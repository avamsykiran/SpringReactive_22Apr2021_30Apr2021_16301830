import { Component, OnInit } from '@angular/core';
import { Dept } from '../model/dept';
import { DeptsService } from '../service/depts.service';

@Component({
  selector: 'app-depts',
  templateUrl: './depts.component.html',
  styleUrls: ['./depts.component.css']
})
export class DeptsComponent implements OnInit {

  depts: Dept[];
  isComplete:boolean;
  errMsg:string;

  constructor(private deptsService: DeptsService) {
    this.depts = [];
    this.isComplete=false;
    this.errMsg=null;
  }

  ngOnInit(): void {
    this.deptsService.getAll().subscribe(
      data => this.depts=data,
      err => {console.log(err); this.errMsg="Sorry! Could not compelte the fetech operation";},
      () => this.isComplete=true
    );
  }

}
