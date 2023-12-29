package com.library.service;

import java.util.List;

import com.library.Entity.Subjects;

public interface SubjectsService {
	public Subjects addSubject(Subjects subjects);
	public List<Subjects> getAllSubjects();
}
