package com.cts.rxjd.service;

public class NumberSeriesService implements Runnable{

	private int start;
	private int end;
	
	public NumberSeriesService(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for(int n=start;n<=end;n++) {
			System.out.println(n);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
