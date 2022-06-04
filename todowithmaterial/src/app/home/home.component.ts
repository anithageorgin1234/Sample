import { Component, OnInit } from '@angular/core';
import { Todoclass } from '../todoclass.model';
import { CrudHttpService } from '../crud-http.service'   ;
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private crudHttpService: CrudHttpService) { }
  panelOpenState = false;
  todoList:any=[];
  title = 'todowithmaterial';
  longText = `totList`;
  userName="Anitha Georgin";
  totitle="";
  todotext="";
  names=["anitha","georgin","gladwin","gerald"];
  displayedColumns: string[] = ['id','title', 'text' ];
   
    
 
  num = 1;
  selectedvalue='payload';
 
  ngOnInit(): void {
    this.listTodos();
  }
  listTodos()
  {
this.crudHttpService.list().subscribe((response)=>
{
  this.todoList=response;
  console.log(this.todoList);
},(error=>
  {
    console.log("Error")
  }))
  }

  Add()
  {
   let todo= new Todoclass(new Date().getTime(),this.totitle,this.todotext);
   this.crudHttpService.create(todo).subscribe(
    (response)=>{
      this.listTodos();
    }
  )
  }
  edit(todo:any)
  {
    let data={
      id:new Date().getTime(),
      title:"edit Text"}
    this.crudHttpService.update(todo.id,data).subscribe(
      (response)=>{
        this.listTodos();
      }
    )
  }
  delete(id:any)
  {
    this.crudHttpService.delete(id).subscribe(
      (response)=>
      {
        this.listTodos();
      }
    )
  }
}
