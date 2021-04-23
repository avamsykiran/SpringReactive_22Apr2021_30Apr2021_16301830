package com.cts.rxjd.service;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public class ReactiveNumberSeriesService2 {

	public static Observable<Integer> generateSeries(int start,int end) {
		return Observable.create(emitter -> {
			(new Thread(() ->{
				if(start>end) {
					emitter.onError(new Exception("Invalid Boundaries"));
				}
				
				try {
					for (int n = start; n <= end; n++) {
						emitter.onNext(n);
						Thread.sleep(500);
					}
					emitter.onComplete();
				} catch (InterruptedException e) {
						emitter.onError(e);
				}
			})).start();
		});
	}
	
	public static Observable<Integer> generateEvenSeries(int start,int end) {
		return generateSeries(start,end)
				.filter(v -> v%2==0);
	}
	
	public static Observable<Integer> generateSquaredSeries(int start,int end) {
		return generateSeries(start,end)
				.map(v -> v*v);
	}
	public static Observable<Integer> generateEvenSquaredSeries(int start,int end) {
		return generateSeries(start,end)
				.filter(v -> v%2==0)
				.map(v -> v*v);
	}
}
