package com.cts.swfd.service;

import com.cts.swfd.model.Department;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DeptService {
	Flux<Department> getAll();
	Mono<Department> getById(int id);
	Mono<Department> add(Department dept);
	Mono<Void> deleteById(int id);
}
