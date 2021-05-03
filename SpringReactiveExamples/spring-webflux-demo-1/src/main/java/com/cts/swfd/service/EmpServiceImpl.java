package com.cts.swfd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.swfd.model.Employee;
import com.cts.swfd.repo.EmpRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepo repo;
	
	@Override
	public Flux<Employee> getAll() {
		return repo.getAll();
	}

	@Override
	public Mono<Employee> getById(int id) {
		return repo.getById(id);
	}

	@Override
	public Mono<Employee> add(Employee emp) {
		return repo.add(emp);
	}

	@Override
	public Mono<Void> deleteById(int id) {
		return repo.deleteById(id);
	}

	@Override
	public Mono<Employee> getByMobile(String mobile) {
		return getAll()
				.filter(e -> e.getMobile().equals(mobile))
				.last();
	}

}
