package com.cts.swfd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.swfd.model.Department;
import com.cts.swfd.repo.DeptRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptRepo deptRepo;
	
	@Override
	public Flux<Department> getAll() {
		return deptRepo.getAll();
	}

	@Override
	public Mono<Department> getById(int id) {
		return deptRepo.getById(id);
	}

	@Override
	public Mono<Department> add(Department dept) {
		return deptRepo.add(dept);
	}

	@Override
	public Mono<Void> deleteById(int id) {
		return deptRepo.deleteById(id);
	}

}
