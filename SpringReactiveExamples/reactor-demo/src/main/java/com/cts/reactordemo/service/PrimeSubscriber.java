package com.cts.reactordemo.service;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class PrimeSubscriber implements Subscriber<Integer> {

	private Subscription subscription;
	private int acceptableCount=1;
	
	@Override
	public void onSubscribe(Subscription s) {
		this.subscription=s;
		s.request(acceptableCount);		
	}

	@Override
	public void onNext(Integer t) {
		int count=2;
		for(int i=2;i<=t/2;i++) {
			if(t%i==0) {
				count++;
				break;
			}
		}
		
		if(count>2)
			System.out.println(t + " is not prime");
		else
			System.out.println(t + " is prime");
		
		subscription.request(acceptableCount);
	}

	@Override
	public void onError(Throwable t) {
		System.out.println(t.getMessage());
	}

	@Override
	public void onComplete() {
		System.out.println("Job done");
	}

}
