package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student1")
public class Student1 {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "branch")
    private String branch;

    @Column(name = "fee")
    private int fee;
    
    public Student1() {
    	
    }
	public Student1(int id, String name, String email, String branch, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.branch = branch;
		this.fee = fee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		
		return (id+" "+name+" "+email+" "+branch+" "+fee);
	}
    
}
