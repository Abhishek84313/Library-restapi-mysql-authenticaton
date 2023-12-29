package com.library.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.Entity.Subjects;
import com.library.repository.SubjectsRepo;
import com.library.service.SubjectsService;


@Service
public class SubjectsServiceImpl implements SubjectsService{
	
	@Autowired
	private SubjectsRepo studentsrepo;

	@Override
	public Subjects addSubject(Subjects subjects) {
		// TODO Auto-generated method stub
		return studentsrepo.save(subjects);
	}

	@Override
	public List<Subjects> getAllSubjects() {
		// TODO Auto-generated method stub
		return studentsrepo.findAll();
	}

}
