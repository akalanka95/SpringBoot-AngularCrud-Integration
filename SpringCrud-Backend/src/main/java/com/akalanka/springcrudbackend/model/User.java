package com.akalanka.springcrudbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id	
	private int id;
	private String fname;
	private String lname;
	
}