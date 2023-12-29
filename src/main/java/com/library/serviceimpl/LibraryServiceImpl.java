package com.library.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.Entity.Library;
import com.library.repository.LibraryRepo;
import com.library.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService{
	
	@Autowired
	private LibraryRepo libraryrepo;

	@Override
	public Library addLib(Library library) {
		// TODO Auto-generated method stub
		return libraryrepo.save(library);
	}

	@Override
	public List<Library> getLibDetails() {
		// TODO Auto-generated method stub
		return libraryrepo.findAll();
	}

}
