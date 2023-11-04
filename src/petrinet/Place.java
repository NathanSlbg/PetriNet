package petrinet;

public class Place {

// Rajouter liste de edge_in et edge_out
	
	private int jeton;

	public Place(int jeton) {
		this.jeton = jeton;
	}
	
	public int getJeton() {
		return jeton;
	}

	public void remove(int value) {
		this.jeton= this.jeton - value;
	}
	public void add(int value) {
		this.jeton= this.jeton + value;
	}
	
}
