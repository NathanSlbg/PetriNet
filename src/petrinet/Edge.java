package petrinet;

public class Edge {
	
	private int value;
	private Place place;
	
	public Edge(int value, Place place) {
		this.value = value;
		this.place = place;
	}
	
	public void Trigger() {
		
	}
	
	public int getValue() {
		return value;
	}

	public Place getPlace() {
		return this.place;
	}

	public boolean IsTriggerable() {
		return true;
	}
}
