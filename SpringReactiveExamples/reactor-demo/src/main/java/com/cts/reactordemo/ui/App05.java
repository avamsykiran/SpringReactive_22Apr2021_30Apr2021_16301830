package com.cts.reactordemo.ui;

import java.time.Duration;

import com.cts.reactordemo.service.NumericSeriesService;
import com.cts.reactordemo.service.PrimeSubscriber;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

public class App05 {

	public static void main(String[] args) {

		System.out.println("App Started!");

		Flux.interval(Duration.ofMillis(500))
		.subscribeOn(Schedulers.parallel())
		.subscribe(System.out::println);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("App Ended!");
	}

}
