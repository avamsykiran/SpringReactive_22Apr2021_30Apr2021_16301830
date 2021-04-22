package com.cts.rxjd.ui;

import com.cts.rxjd.service.ReactiveService;

import io.reactivex.Observable;

public class App01 {

	public static void main(String[] args) {
		ReactiveService rs = new ReactiveService();
		
		rs.getGreeting().subscribe(System.out::println);
		
		Observable<String> ob1 = rs.getData();
		Observable<String> ob2 = rs.getData();
				
		ob1.subscribe(
				ele -> {System.out.println("We have received "+ele);},
				err -> {err.printStackTrace();},
				() -> {System.out.println("Job Accomplished");}
		);
		
		ob2.subscribe(
				ele -> {System.out.println("We have received "+ele);},
				err -> {err.printStackTrace();},
				() -> {System.out.println("Job Accomplished");}
		);
	}
}
