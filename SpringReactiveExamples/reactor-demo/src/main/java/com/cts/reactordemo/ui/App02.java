package com.cts.reactordemo.ui;

import com.cts.reactordemo.service.FactorSeriesService;

import reactor.core.publisher.Flux;

public class App02 {

	public static void main(String[] args) {

		FactorSeriesService ser = new FactorSeriesService();
		
		//ser.generateFactorSeries(1, 10).subscribe(System.out::println);
		
		ser.generateFactorSeries(1, 10)
		.flatMap(list -> Flux.fromIterable(list))
		.subscribe(System.out::println);

	}

}
