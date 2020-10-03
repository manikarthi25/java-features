package com.manikarthi25.data;

public class Bike {

	private String bikeName;
	private String bikeModel;

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public String getBikeModel() {
		return bikeModel;
	}

	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}

	@Override
	public String toString() {
		return "Bike {bikeName=" + bikeName + ", bikeModel=" + bikeModel + "}";
	}

}
