package com.cts.swfd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.swfd.model.Department;
import com.cts.swfd.service.DeptService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin
@RequestMapping("/depts")
public class DeptController {
	
	@Autowired
	private DeptService service;
	
	@GetMapping
	public Flux<Department> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Mono<Department> get(@PathVariable("id") int id){
		return service.getById(id);
	}
	
	@PostMapping
	public Mono<Department> create(@RequestBody Department dept){
		return service.add(dept);
	}
	
	@DeleteMapping("/{id}")
	public Mono<Void> delete(@PathVariable("id") int id){
		return service.deleteById(id);
	}
	
}
