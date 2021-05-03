package com.cts.swfd.service;

import com.cts.swfd.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmpService {
	Flux<Employee> getAll();
	Mono<Employee> getById(int id);
	Mono<Employee> add(Employee emp);
	Mono<Void> deleteById(int id);
	Mono<Employee> getByMobile(String mobile);
}