package com.springmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users") // name of the collection/table 
public class RegisterModel {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	
	private String userName;

	public RegisterModel() {
		// TODO Auto-generated constructor stub
	}

	public RegisterModel(String fname, String lname, String uname) {
		this.firstName = fname;
		this.lastName = lname;
		this.setUserName(uname);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegisterModel [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", userName=");
		builder.append(userName);
		builder.append("]");
		return builder.toString();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
