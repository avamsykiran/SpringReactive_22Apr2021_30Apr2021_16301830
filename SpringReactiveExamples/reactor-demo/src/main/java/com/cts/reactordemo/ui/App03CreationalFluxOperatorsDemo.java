package com.cts.reactordemo.ui;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

import reactor.core.publisher.Flux;

public class App03CreationalFluxOperatorsDemo {

	public static void main(String[] args) {

		Flux.just("Hai", "Hello", "Welcome")
		.subscribe(System.out::println);

		Flux.fromArray(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 })
		.subscribe(System.out::println);

		Flux.fromIterable(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }))
		.subscribe(System.out::println);

		Flux.fromStream(Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }))
		.subscribe(System.out::println);

		Flux<String> f1 = Flux.just("Hai","Hello","Welcome");
		Flux<String> f2 = Flux.just("Nobody","Somebody","Everybody");
		
		f1.zipWith(f2, (s1,s2) -> (s1 + " " + s2))
		.subscribe(System.out::println);
			
		f1.zipWithIterable(
				Arrays.asList(new Integer[] { 1, 2, 3, 4, 5}),
				(s1,i1) -> (s1+i1.toString())
				).subscribe(System.out::println,Throwable::printStackTrace);
	}

}
