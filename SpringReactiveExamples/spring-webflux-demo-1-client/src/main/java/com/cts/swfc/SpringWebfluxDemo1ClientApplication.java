package com.cts.swfc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.cts.swfd.model.Department;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class SpringWebfluxDemo1ClientApplication implements CommandLineRunner {

	public static final String rootUrl = "http://localhost:9999/";
	
	public static void main(String[] args) {
		SpringApplication.run(SpringWebfluxDemo1ClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		WebClient wc = WebClient.create(rootUrl);
		
		wc.get()
			.uri("depts")
			.retrieve()
			.bodyToFlux(Department.class)
			.subscribe(System.out::println);
		
		wc.get()
			.uri("depts/{id}","202")
			.retrieve()
			.bodyToMono(Department.class)
			.map(d -> d==null?"No Dept Found":d.toString())
			.subscribe(System.out::println,Throwable::printStackTrace);
		
	}

}
