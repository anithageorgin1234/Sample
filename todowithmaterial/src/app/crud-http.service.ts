import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CrudHttpService {

  constructor(private http:HttpClient) { }

  apiUrlreg:string="http://localhost:3000/useregistraion";
  apiUrl:string="http://localhost:8080/todo";
  headers=new HttpHeaders().set('Content-Type','application/json');

  list()
  {
    return this.http.get("http://localhost:8080/getTodos");
  }
  getData(name:any):Observable<any>
  {
     
    return this.http.get(this.apiUrlreg+"/?userName="+name);
  }
  create(data:any):Observable<any>{
    console.log(JSON.stringify(data));
       return this.http.post(this.apiUrl,data);
  }
  update(id:any,data:any):Observable<any>{
    let API_URL=this.apiUrl+"/"+id;
    return this.http.put(API_URL,data,{headers:this.headers});

  }
  delete(id:any):Observable<any>
  {
    let API_URL=this.apiUrl+"/"+id;
    return this.http.delete(API_URL );
  }
   
}
