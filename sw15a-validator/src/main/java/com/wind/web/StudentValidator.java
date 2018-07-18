package com.wind.web;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Student.class.isAssignableFrom(clazz);
//		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("validator()");
		Student student = (Student) target;
		
		String studentName = student.getName();
		if(studentName == null || studentName.trim().isEmpty()) {
			System.out.println("studentName is null or empty");
			errors.rejectValue("name", "trouble");
		}
		
		int studentId = student.getId();
		if(studentId==0) {
			System.out.println("studentId is 0");
			errors.rejectValue("id", "trouble");
		}
	}
}