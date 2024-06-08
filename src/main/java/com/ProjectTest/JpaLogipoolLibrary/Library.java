package com.ProjectTest.JpaLogipoolLibrary;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Library {
	@Id
	private int lid;
	private String lname;
	
	@OneToMany
	private List<Student> student;

	public Library() {
		super();
	}

	public Library(int lid, String lname, List<Student> student) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.student = student;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Library [lid=" + lid + ", lname=" + lname + ", student=" + student + "]";
	}
	
	
	

}
