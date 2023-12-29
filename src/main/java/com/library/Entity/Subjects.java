package com.library.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
@Data

@Entity
@Table(name = "subject")
public class Subjects {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sub_id")
	private int subject_id;
	private String subject_name;
	private String course;
	
	public Subjects() {
		// TODO Auto-generated constructor stub
	}

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Subjects(int subject_id, String subject_name, String course) {
		super();
		this.subject_id = subject_id;
		this.subject_name = subject_name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Subjects [subject_id=" + subject_id + ", subject_name=" + subject_name + ", course=" + course + "]";
	}
	
	@ManyToMany(mappedBy = "subjectsTable")
	private List<Student> student = new ArrayList<>();
}
