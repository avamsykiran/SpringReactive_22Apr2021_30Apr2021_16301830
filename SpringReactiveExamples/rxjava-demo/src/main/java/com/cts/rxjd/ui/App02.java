package com.cts.rxjd.ui;

import com.cts.rxjd.service.NumberSeriesService;

public class App02 {

	public static void main(String[] args) {
	
		new Thread(new NumberSeriesService(1, 10)).start();

	}

}
