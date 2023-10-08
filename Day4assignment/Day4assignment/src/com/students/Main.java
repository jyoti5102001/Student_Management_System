package com.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		StudentService stService=new StudentServiceImp();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Student management System");
		
		System.out.println("1.For adding student ");
		System.out.println("2.for deleting Student ");
		System.out.println("3.For finding student by student id ");
		System.out.println("4.For find students by pin code");
		System.out.println("5 For sort students by name");
		System.out.println("6 To get unique-student-marks-list");
		System.out.println("7 To add new student list");
		
		
		while(true)
		{
		System.out.println("Enter option ");
		int n=sc.nextInt();
		
		
		if(n==1)
		{
			System.out.println("Enter student id ");
			int id=sc.nextInt();
			
			System.out.println("Enter student name ");
			String name=sc.next();
			
			System.out.println("Enter marks ");
			int marks=sc.nextInt();
			
			System.out.println("Enter section ");
			String section=sc.next();
			
			System.out.println("Enter city name ");
			String city=sc.next();
			
			System.out.println("Enter state name ");
			String state=sc.next();
			
			System.out.println("Enter pincode ");
			String pincode=sc.next();
			
			Address add=new Address(city,state,pincode);
			
			Student St=new Student(id,name,marks,section,add);
			
//			StudentService stService=new StudentServiceImp();
			List<Student>students=stService.addStudent(St);
			
			System.out.println(students);
			
			System.out.println("Want to add more details?Y/N");
			String s=sc.next();
			if(s=="N")
			{
				return;
			}
			
			
		}
		
		else if(n==2)
		{
			System.out.println("Enter Student Id ");
			int id=sc.nextInt();
			
//			StudentService stService=new StudentServiceImp();
			String result=stService.deleteStudent(id);
			
			System.out.println(result);
			System.out.println("Want to add more details?Y/N");
			String s=sc.next();
			if(s=="N")
			{
				return;
			}
			
		}
		
		else if(n==3)
		{
			System.out.println("Enter Student Id ");
			int id=sc.nextInt();
			
//			StudentService stService=new StudentServiceImp();
			Student st= stService.findStudent(id);
			
			System.out.println(st);
			
			System.out.println("Want to add more details?Y/N");
			String s=sc.next();
			if(s=="N")
			{
				return;
			}
			
			
		}
	    
		else if(n==4)
		{
			System.out.println("enter student pin to find student:");
			String pin=sc.next();
			
//			StudentService stService=new StudentServiceImp();
			List<Student> list= stService.findStudentWithPincode(pin);
			System.out.println(list);
			
			System.out.println("Want to add more details?Y/N");
			String s=sc.next();
			if(s=="N")
			{
				return;
			}
			
		}
		
		else if(n == 5) {
			System.out.println("sorting students by name:");
			
//			StudentService stService=new StudentServiceImp();
			List<Student> list= stService.sortWithName();
			System.out.println(list);
			
			System.out.println("Want to add more details?Y/N");
			String s=sc.next();
			if(s=="N")
			{
				return;
			}
		}
		
		else if(n == 6) {
			
//			StudentService stService=new StudentServiceImp();
			List<Integer> list= stService.setOfMarks();
			System.out.println(list);
			
			System.out.println("Want to add more details?Y/N");
			String s=sc.next();
			if(s=="N")
			{
				return;
			}
		}
	    

		else if(n == 7) {
			List<Student> newStudents=new ArrayList<>();
			Address add=new Address("delhi","Delhi","151234");
			Student s1=new Student(3, "Deepak", 600, "A", add);
			Address add2=new Address("mumbai","Maharastra","022246");
			Student s2=new Student(20, "Rajat", 550, "D", add2);
			
			newStudents.add(s1);
			newStudents.add(s2);
			
//			StudentService stService=new StudentServiceImp();
			List<Student> addedStudents=stService.addAllStudents(newStudents);
			System.out.println(addedStudents);
			
			System.out.println("Want to add more details?Y/N");
			String s=sc.next();
			if(s=="N")
			{
				return;
			}
		}
		
		else if(n==8) {
			System.out.println("Enter vaild option");
			break;
			
		}
		
		
	}
	}

}
