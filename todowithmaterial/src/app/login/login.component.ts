import { Component, OnInit } from '@angular/core';
import { Login } from '../login';
import { Router } from '@angular/router';
import { CrudHttpService } from '../crud-http.service'   ;
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router:Router,private crudHttpService: CrudHttpService) { }
data:any;
  ngOnInit(): void {
  }
  loginModel=new Login();
  onFormSubmit()
  {
    this.router.navigate(['./home']);
   // this.crudHttpService.getData(this.loginModel.username).subscribe((response)=>
 //   {
    //  this.data=response;
  
      // if(this.data===null || this.data=='')
      // {
     //   this.router.navigate(['']);
     //  }
      // else{

     //   this.router.navigate(['./home']);
      // }
  //  },(error=>
    // {
     //   console.log("Error")
 //     }))
 
  }
     
  }

 
