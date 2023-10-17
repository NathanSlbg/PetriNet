package petrinet;

public class Place {

// Rajouter liste de edge_in et edge_out
	
	private int jeton;
	private Edge edge;

	public Place(int jeton, int place_id) {
		this.jeton = jeton;
		this.edge = edge;
	}
	
	public int getJeton() {
		return jeton;
	}

	public Edge getEdge() {
		return edge;
	}

	public void Remove(int value) {
		this.jeton= this.jeton - value;
	}
	public void Add(int value) {
		this.jeton= this.jeton + value;
	}
	
}
