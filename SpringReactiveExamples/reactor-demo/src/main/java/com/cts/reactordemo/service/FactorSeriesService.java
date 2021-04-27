package com.cts.reactordemo.service;

import java.util.ArrayList;
import java.util.List;

import reactor.core.publisher.Flux;

public class FactorSeriesService {

	public Flux<List<Integer>> generateFactorSeries(int lb, int ub) {
		return Flux.create(emitter -> {
			if (lb > ub) {
				emitter.error(new Exception("Invlaid Boundries"));
				return;
			}

			(new Thread(() -> {
				try {
					for (int i = lb; i <= ub; i++) {
						List<Integer> list = new ArrayList<>();						
						list.add(1);
						for(int j=2;j<=i/2;j++) {
							if(i%j==0) {
								list.add(j);
							}
						}
						list.add(i);
						emitter.next(list);
						Thread.sleep(100);
					}
				} catch (InterruptedException exp) {
					emitter.error(exp);
				}
				emitter.complete();
			})).start();
		});
	}	
}
