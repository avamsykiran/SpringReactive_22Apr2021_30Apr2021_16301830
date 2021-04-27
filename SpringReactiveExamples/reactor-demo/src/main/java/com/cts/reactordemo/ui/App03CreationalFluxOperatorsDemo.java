package com.cts.reactordemo.ui;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

import reactor.core.publisher.Flux;

public class App03CreationalFluxOperatorsDemo {

	public static void main(String[] args) {
		
		Flux.just("Hai","Hello","Welcome").subscribe(System.out::println);
		
		Flux.interval(Duration.ofMillis(100), Duration.ofMillis(500))
		.subscribe(v -> System.out.println(LocalTime.now() + ">> "+v),
				err -> System.out.println(err.getMessage()));
		
		Flux.fromArray(new Integer[] {1,2,3,4,5,6,7,8,9}).subscribe(System.out::println);
		
		Flux.fromIterable(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9}))
		.subscribe(System.out::println);
		
		Flux.fromStream(Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9}))
		.subscribe(System.out::println);
	}

}
