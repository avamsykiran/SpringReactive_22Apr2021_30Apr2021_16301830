package com.cts.swfd.repo;

import com.cts.swfd.model.Department;
import com.cts.swfd.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmpRepo {
	Flux<Employee> getAll();
	Mono<Employee> getById(int id);
	Mono<Employee> add(Employee emp);
	Mono<Void> deleteById(int id);
}