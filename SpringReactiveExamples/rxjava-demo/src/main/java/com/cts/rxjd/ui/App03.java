package com.cts.rxjd.ui;

import com.cts.rxjd.service.ReactiveNumberSeriesService;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class App03 {

	public static void main(String[] args) {
		(new ReactiveNumberSeriesService(1, 20))
		.getObservable().subscribe(new SeriesObserver());
		
		(new ReactiveNumberSeriesService(100, 120))
		.getObservable().subscribe(new SeriesObserver());
		
		(new ReactiveNumberSeriesService(100, 20))
		.getObservable().subscribe(new SeriesObserver());
	}
}

class SeriesObserver implements Observer<Integer>{

	@Override
	public void onSubscribe(Disposable d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNext(Integer value) {
		System.out.println("Received " + value);
	}

	@Override
	public void onError(Throwable err) {
		System.out.println(err.getMessage());
	}

	@Override
	public void onComplete() {
		System.out.println("We are done");
	}
}
