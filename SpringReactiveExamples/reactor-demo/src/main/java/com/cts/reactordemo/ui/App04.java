package com.cts.reactordemo.ui;

import com.cts.reactordemo.service.NumericSeriesService;
import com.cts.reactordemo.service.PrimeSubscriber;

public class App04 {

	public static void main(String[] args) {

		NumericSeriesService service = new NumericSeriesService();
		
		service.generateSeries(1, 20).subscribe(new PrimeSubscriber());

	}

}
