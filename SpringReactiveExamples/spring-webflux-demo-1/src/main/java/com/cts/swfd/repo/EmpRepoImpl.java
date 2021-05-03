package com.cts.swfd.repo;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Repository;

import com.cts.swfd.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class EmpRepoImpl implements EmpRepo {
	
	private Map<Integer,Employee> empsMap;
	
	public EmpRepoImpl() {
		this.empsMap = new TreeMap<>();
		
		empsMap.put(101, 
				new Employee(101, "Vamsy", null, 
						"9062224753", "vamsy.kiran@iiht.com",
						true, LocalDate.now(),23450.0));
	}

	@Override
	public Flux<Employee> getAll() {
		return Flux.fromIterable(empsMap.values());
	}

	@Override
	public Mono<Employee> getById(int id) {
		return Mono.justOrEmpty(empsMap.get(id));
	}

	@Override
	public Mono<Employee> add(Employee emp) {
		if(emp!=null) {
			empsMap.put(emp.getEmployeeId(), emp);
		}
		return Mono.justOrEmpty(emp);
	}

	@Override
	public Mono<Void> deleteById(int id) {
		empsMap.remove(id);
		return Mono.empty();
	}

}
