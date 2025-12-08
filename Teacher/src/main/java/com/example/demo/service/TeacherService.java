package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Teacher;

public interface TeacherService {

	void add(Teacher t);
	List<Teacher> display();
	void delete(Integer id);
	Teacher serachById(Integer id);
	Teacher searchByName(String name);
	Teacher update(Integer id, Teacher t);
 
	
}
