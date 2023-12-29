package com.library.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.library.Entity.Subjects;

public interface SubjectsRepo extends JpaRepository<Subjects, Integer>{

}
