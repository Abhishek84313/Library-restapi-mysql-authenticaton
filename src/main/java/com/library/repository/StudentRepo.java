package com.library.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.library.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

	
}
