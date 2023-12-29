package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.Entity.Book;
import com.library.Entity.Library;
import com.library.Entity.Student;
import com.library.Entity.Subjects;
import com.library.serviceimpl.BookServiceImpl;
import com.library.serviceimpl.LibraryServiceImpl;
import com.library.serviceimpl.StudentServiceImpl;
import com.library.serviceimpl.SubjectsServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired 
	private BookServiceImpl bookservimpl;
	
	@Autowired
	private LibraryServiceImpl libraryservimpl;
	
	@Autowired
	private StudentServiceImpl studentservimpl;
	
	@Autowired
	private SubjectsServiceImpl subjectsservimpl;
	
	
	@PostMapping("/addStudent")
	public ResponseEntity<Student> addStudents(@RequestBody Student std){
		Student student = studentservimpl.addStudent(std);
		return ResponseEntity.ok(student);
		//return new ResponseEntity<Student>(student,HttpStatus.CREATED);
	}
	
	@PostMapping("/addBook")
	public ResponseEntity<Book> addBooks(@RequestBody Book book){
		Book bk = bookservimpl.addBook(book);
		return new ResponseEntity<Book>(bk,HttpStatus.CREATED);
	}
	
	
	@PostMapping("/addLib")
	public ResponseEntity<Library> addLibs(@RequestBody Library lib){
		Library libr = libraryservimpl.addLib(lib);
		return new ResponseEntity<Library>(libr,HttpStatus.CREATED);
	}
	
	@PostMapping("/addSubjects")
	public ResponseEntity<Subjects> addSubj(@RequestBody Subjects subj){
		Subjects sub = subjectsservimpl.addSubject(subj);
		return new ResponseEntity<Subjects>(sub,HttpStatus.CREATED);
	}
	
	@GetMapping("/getStudent")
	public ResponseEntity<List<Student>> getStudents(){
		List<Student> student = studentservimpl.getStudentDetails();
		return new ResponseEntity<List<Student>>(student,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getBook")
	public ResponseEntity<List<Book>> getBooks(){
		List<Book> bk = bookservimpl.getBookdetails();
		return new ResponseEntity<List<Book>>(bk,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getLib")
	public ResponseEntity<List<Library>> getLibr(){
		List<Library> lib = libraryservimpl.getLibDetails();
		return new ResponseEntity<List<Library>>(lib,HttpStatus.ACCEPTED); 
	}
	
	@GetMapping("/getSubjects")
	public ResponseEntity<List<Subjects>> getSubj(){
		List<Subjects> sub = subjectsservimpl.getAllSubjects();
		return new ResponseEntity<List<Subjects>>(sub,HttpStatus.ACCEPTED);
	}
}
