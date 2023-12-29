package com.library.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "library")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "lib_id")
	private int library_id;
	private String libary_name;
	public int getLibrary_id() {
		return library_id;
	}
	public void setLibrary_id(int library_id) {
		this.library_id = library_id;
	}
	public String getLibary_name() {
		return libary_name;
	}
	public void setLibary_name(String libary_name) {
		this.libary_name = libary_name;
	}
	public Library(int library_id, String libary_name) {
		super();
		this.library_id = library_id;
		this.libary_name = libary_name;
	}
	
	public Library() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Library [library_id=" + library_id + ", libary_name=" + libary_name + "]";
	}
	
	
	@OneToMany(cascade = CascadeType.ALL,
            mappedBy = "library")
 private List<Student> student;
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
}
