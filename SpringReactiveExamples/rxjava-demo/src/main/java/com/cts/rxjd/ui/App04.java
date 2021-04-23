package com.cts.rxjd.ui;

import com.cts.rxjd.service.ReactiveNumberSeriesService;
import com.cts.rxjd.service.ReactiveNumberSeriesService2;

public class App04 {

	public static void main(String[] args) {
		ReactiveNumberSeriesService2
		.generateSeries(1, 10).subscribe(
				System.out::println,
				Throwable::printStackTrace,
				() -> System.out.println("Done Series")
				);
		
		ReactiveNumberSeriesService2
		.generateEvenSeries(100, 120).subscribe(
				System.out::println,
				Throwable::printStackTrace,
				() -> System.out.println("Done Even Series")
				);
		
		ReactiveNumberSeriesService2
		.generateSquaredSeries(30, 35).subscribe(
				System.out::println,
				Throwable::printStackTrace,
				() -> System.out.println("Done Sqrd Series")
				);
		
		ReactiveNumberSeriesService2
		.generateSquaredSeries(200, 205).subscribe(
				System.out::println,
				Throwable::printStackTrace,
				() -> System.out.println("Done Even Sqrd Series")
				);
	}

}
