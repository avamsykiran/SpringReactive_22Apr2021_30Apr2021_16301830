package com.cts.swfd.repo;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Repository;

import com.cts.swfd.model.Department;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class DeptRepoImpl implements DeptRepo {

	Map<Integer, Department> deptsMap;

	public DeptRepoImpl() {
		deptsMap = new TreeMap<>();
		deptsMap.put(101, new Department(101, "Java DevTeam", "Vizag", null));
		deptsMap.put(102, new Department(102, "Angular DevTeam", "Vizag", null));
	}

	@Override
	public Flux<Department> getAll() {
		return Flux.fromIterable(deptsMap.values());
	}

	@Override
	public Mono<Department> getById(int id) {
		return Mono.justOrEmpty(deptsMap.get(id));
	}

	@Override
	public Mono<Department> add(Department dept) {
		if (dept != null) {
			deptsMap.put(dept.getDeptId(), dept);
		}
		return Mono.justOrEmpty(dept);
	}

	@Override
	public Mono<Void> deleteById(int id) {
		deptsMap.remove(id);
		return Mono.empty();
	}

}
