import { Component, OnInit } from '@angular/core';
import  {HttpClient} from '@angular/common/http';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
	model:LoginModel={
		email:"",
		password:"",
		usertype:"1"
	};
  constructor(private http: HttpClient) { 

  }

  ngOnInit() {
  }

  sendDetails():void{
  	let url = "http://localhost:8080/service/create"
  	console.log(this.model);
  
  	this.http.put(url,this.model).subscribe(
  		val=>{console.log("call happened")},
  		response=>{console.log("call error")},
  		 () => {
            console.log("The PUT observable is now completed.");
        }
  		);
  };

}

export interface LoginModel{
	email:string;
	password:string;
	usertype:string;
}
