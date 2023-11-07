package src.petrinet;

public class Edge {
	
	private int value;
	private Place place;
	
	public Edge(int value, Place place) {
		this.value = value;
		this.place = place;
	}
	
	public void Trigger() {
		
	}
	
	public boolean IsTriggerable() {
		return true;
	}

	public int getValue() {
		return value;
	}

	public Place getPlace() {
		return this.place;
	}
	public void setValue(int value) {
		this.value=value;
	}
	public String affichage() {
		return "arc de poids "+this.getValue();
	}


}
