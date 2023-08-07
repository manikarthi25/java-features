package com.manikarthi25.programs;

import java.util.Map;

public class Helper2 implements Runnable {
	Map<String, Integer> map;

	public Helper2(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "helper2").start();
	}

	@Override
	public void run() {
		map.put("two", 2);
		try {
			System.out.println("Helper2 Sleeping");
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
