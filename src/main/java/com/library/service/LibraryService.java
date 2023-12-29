package com.library.service;

import java.util.List;

import com.library.Entity.Library;

public interface LibraryService {
	public Library addLib(Library library);
	public List<Library> getLibDetails();
}
