package com.cts.reactordemo.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class NumericSeriesService {

	public Flux<Integer> generateSeries(int lb, int ub) {
		return Flux.create(emitter -> {

			if (lb > ub) {
				emitter.error(new Exception("Invlaid Boundries"));
				return;
			}

			(new Thread(() -> {
				try {
					for (int i = lb; i <= ub; i++) {
						emitter.next(i);
						Thread.sleep(500);
					}
				} catch (InterruptedException exp) {
					emitter.error(exp);
				}
				emitter.complete();
			})).start();
		});
	}
	
	public Flux<Integer> generateEvenSeries(int lb, int ub) {
		return generateSeries(lb, ub).filter(n -> n%2==0);
	}
	
	public Flux<Integer> generateSquaredSeries(int lb, int ub) {
		return generateSeries(lb, ub).map(v -> v*v);
	}
	
	public Mono<Integer> sumOfGeneratesSeries(int lb,int ub){
		return generateSeries(lb, ub).reduce((a,b) -> a+b);
	} 
	
	
}
