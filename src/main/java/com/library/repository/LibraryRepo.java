package com.library.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.library.Entity.Library;

public interface LibraryRepo extends JpaRepository<Library, Integer>{

	
}
