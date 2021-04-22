package com.cts.rxjd.service;

import io.reactivex.Observable;

public class ReactiveService {
	
	public Observable<String> getGreeting() {
		return Observable.just("Hello! Welcome All");
	}

	public Observable<String> getData() {
		return Observable.just("a","b","c","d","e","f");
	}
}
