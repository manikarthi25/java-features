package com.manikarthi25.programs;

import java.util.Map;

public class Helper4 implements Runnable {

	Map<String, Integer> map;

	public Helper4(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "helper4").start();
	}

	@Override
	public void run() {
		map.put("four", 4);
		try {
			System.out.println("Helper4 Sleeping");
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
