package com.cts.reactordemo.ui;

import java.time.Duration;

import com.cts.reactordemo.service.NumericSeriesService;
import com.cts.reactordemo.service.PrimeSubscriber;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

public class App06 {

	public static void main(String[] args) {
		
		NumericSeriesService service = new NumericSeriesService();
		
		/*service.generateSeries(1, 50)
		.take(Duration.ofMillis(2000))
		.subscribe(System.out::println);
		*/
		
		/*
		service.generateSeries(1, 50)
		.takeUntil(i -> i%13==0)
		.subscribe(System.out::println);
		*/

		/*
		service.generateSeries(1, 50)
		.takeWhile(i -> i%13!=0)
		.subscribe(System.out::println);
		*/
		
		service.generateSeries(1, 25)
		.takeLast(5)
		.subscribe(System.out::println);
	}

}
