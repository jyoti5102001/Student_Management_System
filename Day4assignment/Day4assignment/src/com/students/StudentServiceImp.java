package com.students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class StudentServiceImp implements StudentService {

    List<Student> students=new ArrayList<>();
    
	@Override
	public List<Student> addStudent(Student st) {

//       HashSet<Student> student=new HashSet<Student>();
//       student.add(st);
//       
//       List<Student> list=new ArrayList<Student>(student);
		
        students.add(st);
		return students;
	}

	  String msg="Details Not found";
	@Override
	public String deleteStudent(int id) {

      
        students.forEach(st ->{
        	if(st.getId()==id)
        	{
        		students.remove(st);
        		msg="Student Removed";
        	}
        });
		return msg;
	}

	@Override
	public Student findStudent(int id) {

		Student s=new Student();
		students.forEach(stu -> {
			if(stu.getId()==id) {
				s.setId(id);
				s.setName(stu.getName());
				s.setMarks(stu.getMarks());
				s.setSection(stu.getSection());
				s.setAddress(stu.getAddress());
			}
		});
	   return s;
	}

	@Override
	public List<Student> findStudentWithPincode(String pincode) {

		List<Student> list=new ArrayList<>();
		students.forEach(stu -> {
			if(stu.getAddress().getPincode().equals(pincode)) {
				list.add(stu);
			}
		});
	   return list;
	}

	@Override
	public List<Student> sortWithName() {
		
		Collections.sort(students,new SortByName());
		return students;
	}

	@Override
	public List<Integer> setOfMarks() {
		
		List<Integer> uniqueMarks=new ArrayList<>();
		HashSet<Student> set=new HashSet<>(students);
		set.forEach(s ->{
			uniqueMarks.add(s.getMarks());
		});
		return uniqueMarks;
	}

	@Override
	public List<Student> addAllStudents(List<Student> list) {
		list.forEach(student ->{
			students.add(student);
		});
		Collections.sort(students, new SortByMarks());
		System.out.println(students.size());
		return students;
	}

	
}
