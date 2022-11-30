package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.bind.Student;

@Service
public class StudentService 
{
	public Student getStudnet()
	{
		Student s1 = new Student("Ashok",154,22,"@Gmail.com",12);
		return s1;
	
	}

}
