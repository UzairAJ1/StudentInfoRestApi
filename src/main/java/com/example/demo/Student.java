package com.example.demo;

public class Student {
	private int id;
	private String name;
public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


}
