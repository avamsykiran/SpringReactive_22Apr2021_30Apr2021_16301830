package com.cts.reactordemo.ui;

import com.cts.reactordemo.service.NumericSeriesService;

public class App01 {

	public static void main(String[] args) {

		NumericSeriesService service = new NumericSeriesService();

		// service.generateSeries(1, 20).subscribe(System.out::println,
		// Throwable::printStackTrace);
		// service.generateSeries(100, 20).subscribe(System.out::println,
		// Throwable::printStackTrace);
		service.sumOfGeneratesSeries(1, 20).subscribe(System.out::println, Throwable::printStackTrace);
	}

}
