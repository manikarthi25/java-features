package com.manikarthi25.parallelstream;

public class Sum {

	private Integer total = 0;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public void performSum(int input) {
		total += input;
	}

}
