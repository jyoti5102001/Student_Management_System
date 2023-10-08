package com.students;

import java.util.List;

public interface StudentService {

	
	        public List<Student> addStudent(Student st) ;
			
			public String deleteStudent(int id);
			
			public Student findStudent(int id) ;
			
			public List<Student> findStudentWithPincode(String pincode) ;
			
			public List<Student> sortWithName() ;
			
			public  List<Integer> setOfMarks()  ;
			
			public  List<Student> addAllStudents(List<Student> list) ;
}
