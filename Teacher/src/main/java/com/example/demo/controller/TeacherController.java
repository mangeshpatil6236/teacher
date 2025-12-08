package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService ts;
	
	@PostMapping("add")
	public void add(@RequestBody Teacher t) {
		ts.add(t);
	}
	
	@GetMapping("display")
	public List<Teacher> display(){
		return ts.display();
	}
	
	@DeleteMapping("delete = {id}")
	public void delete(@PathVariable Integer id) {
		ts.delete(id);
	}
	
	
	@PostMapping("searchbyid = {id}")
	public Teacher search(@PathVariable Integer id) {
		return ts.serachById(id);
	}
	
	@PostMapping("searchbyname = {name}")
	public Teacher search(@PathVariable String name) {
		return ts.searchByName(name);
	}
	
	@PutMapping("update = {id}")
	public Teacher update(@PathVariable Integer id, @RequestBody Teacher t) {
		return ts.update(id,t);
	}
}
