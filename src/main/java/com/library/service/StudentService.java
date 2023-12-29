package com.library.service;

import java.util.List;

import com.library.Entity.Student;

public interface StudentService {
	public Student addStudent(Student student);
	public List<Student> getStudentDetails();
}
