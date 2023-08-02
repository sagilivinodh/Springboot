package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
			createMultipleStudents(studentDAO);
			readStudent(studentDAO);
			queryForStudents(studentDAO);
			queryForStudentByLastName(studentDAO);
			updateStudent(studentDAO);
			deleteStudent(studentDAO);
			deleteAllStudent(studentDAO);
		};
	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		System.out.println("Deleting all students........" );
		int numRowsDeleted= studentDAO.deleteAll();
		System.out.println("Deleted row count: " + numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 3;
		System.out.println("Deleting student id: " + studentId);
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {

		// retrieve student based on the id: primary key
		int studentId = 3;
		System.out.println("Getting student with id:" + studentId);
		Student myStudent = studentDAO.findById(studentId);
		// change first name to scooby
		System.out.println("Updating student..........");
		myStudent.setFirstName("Scooby");
		// update the student
		studentDAO.update(myStudent);
		//display the updated student
		System.out.println("Update student: " + myStudent);

	}

	private void queryForStudentByLastName(StudentDAO studentDAO) {
		// get list of students
		List<Student> theStudents = studentDAO.findByLastName("duck");
		// display list of students
		for(Student tempStudent: theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		// get a list of students
		List<Student> theStudents = studentDAO.findAll();
		// display list of students
		for(Student tempStudent: theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		// create student object
		System.out.println("Creating new student object.......");
		Student tempStudent = new Student("Daffy", "Duck", "daffyduck@gmail.com");
		// save the student
		System.out.println("Saving the student");
		studentDAO.save(tempStudent);
		// display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Save student. Generated id: " + theId);
		// retrieve student based on the id: primary key
		System.out.println("Retrieving the student with id:" + theId);
		Student myStudent = studentDAO.findById(theId);
		// display student
		System.out.println("Found the student: "+ myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		// create multiple students
		System.out.println("Creating new student object.......");
		Student tempStudent1 = new Student("Maha", "Lakshmi", "mahalakshmi@gmail.com");
		Student tempStudent2 = new Student("mary", "public", "mary@gmail.com");
		Student tempStudent3 = new Student("bonita", "applebum", "bonita@gmail.com");
		Student tempStudent4 = new Student("Vinod", "sagili", "sagilivinod@gmail.com");
		// save the student objects
		System.out.println("Saving the student.........");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		studentDAO.save(tempStudent4);

	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating new student object.......");
		Student tempStudent = new Student("Vinodh", "Sagili", "sagilivinodh1@gmail.com");
		//save the student object
		System.out.println("Saving the student.........");
		studentDAO.save(tempStudent);
		//display id for the saved student
		System.out.println("Saved student. Generated id:" + tempStudent.getId());
	}

}
