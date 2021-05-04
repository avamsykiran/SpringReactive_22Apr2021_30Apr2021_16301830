import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DeptsComponent } from './depts/depts.component';

const routes: Routes = [
  {path:'',component:DeptsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
