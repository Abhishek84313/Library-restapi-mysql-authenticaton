package com.library.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.Entity.Student;
import com.library.repository.StudentRepo;
import com.library.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo studentrepo;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}

	@Override
	public List<Student> getStudentDetails() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}

}
