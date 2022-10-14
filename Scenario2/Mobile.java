package Scenario2;

public abstract class Mobile {
	
	abstract void bluetooth();
	private int distance;
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
}
