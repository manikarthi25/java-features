package com.manikarthi25.programs;

import java.util.Map;

public class Helper3 implements Runnable{

	Map<String, Integer> map;

	public Helper3(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "helper3").start();
	}

	@Override
	public void run() {
		map.put("three", 3);
		try {
			System.out.println("Helper3 Sleeping");
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
