package com.cts.swfd.ui;

import reactor.netty.http.client.HttpClient;

public class ReactiveApp {

	public static void main(String[] args) {
		HttpClient hc = HttpClient.create();
		
		hc.get().uri("http://localhost:9999/depts")
			.responseContent().subscribe(System.out::println);
	}

}
