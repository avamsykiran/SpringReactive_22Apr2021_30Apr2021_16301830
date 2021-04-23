package com.cts.rxjd.service;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public class ReactiveNumberSeriesService implements Runnable, ObservableOnSubscribe<Integer> {

	private int start;
	private int end;
	private ObservableEmitter<Integer> emitter;

	public ReactiveNumberSeriesService(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		
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
	}

	public Observable<Integer> getObservable() {
		return Observable.create(this);
	}

	@Override
	public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
		this.emitter = emitter;
		(new Thread(this)).start();
	}
}
