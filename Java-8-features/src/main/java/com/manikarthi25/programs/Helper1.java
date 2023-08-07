package com.manikarthi25.programs;

import java.util.Map;

public class Helper1 implements Runnable {

	Map<String, Integer> map;

	public Helper1(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "helper1").start();
	}

	@Override
	public void run() {
		map.put("one", 1);
		try {
			System.out.println("Helper1 Sleeping");
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
