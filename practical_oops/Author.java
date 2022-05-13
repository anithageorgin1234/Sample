package com.grearlearning.practical;

public class Author {
	
	String name,email;
	char gender;
	
      Author(String name,String email,char gender) {
		 this.name=name;
		 this.email=email;
		 this.gender=gender;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}

 

	 

}
