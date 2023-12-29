package com.library.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "std_id")
	private int student_id;
	private String student_name;
	private String Address;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public Student(int student_id, String student_name, String address) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.Address = address;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", Address=" + Address + "]";
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	@ManyToMany
	@JoinTable(
	  name = "subjects_like", 
	  joinColumns = @JoinColumn(name = "student_ids"), 
	  inverseJoinColumns = @JoinColumn(name = "subject_ids"))
	List<Subjects> subjectsTable = new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_library_id")
    private Library library;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_book_id")
	private Book book;
	
}
