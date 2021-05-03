package com.cts.swfd.ui;

import com.cts.swfd.model.Department;

import reactor.core.publisher.Flux;
import reactor.netty.http.client.HttpClient;

public class ReactiveApp {

	public static void main(String[] args) {
		HttpClient.create()
        .baseUrl("http://localhost:9999/depts")
        .get()
        .responseContent()
        .subscribe(System.out::println);
		
		
		System.out.println("App End");
	}

}
