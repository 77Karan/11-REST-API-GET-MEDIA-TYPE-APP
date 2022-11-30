package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bind.Student;
import in.ashokit.service.StudentService;

@RestController
public class StudentRestController 
{
	@Autowired
	private StudentService service;
	@PostMapping(value= "/getMyStudent",produces= {"application/json","application/xml"})
	public ResponseEntity<Student> getStudent()
	{
		Student student =service.getStudnet();
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		
	}

}
