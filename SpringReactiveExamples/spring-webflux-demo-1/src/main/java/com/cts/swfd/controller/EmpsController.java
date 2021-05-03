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

import com.cts.swfd.model.Employee;
import com.cts.swfd.service.EmpService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin
@RequestMapping("/emps")
public class EmpsController {

	@Autowired
	private EmpService service;
	
	@GetMapping
	public Flux<Employee> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Mono<Employee> getById(@PathVariable("id") int id){
		return service.getById(id);
	}
	
	@GetMapping("/mobile/{mno}")
	public Mono<Employee> getByMobile(@PathVariable("mno") String mobile){
		return service.getByMobile(mobile);
	}
	
	@PostMapping
	public Mono<Employee> add(@RequestBody Employee emp){
		return service.add(emp);
	}
	
	@DeleteMapping
	public Mono<Void> delete(@PathVariable("id") int id){
		return service.deleteById(id);
	}
}
