package petrinet;



public class Edge_out extends Edge{

	public Edge_out(int value, Place place) {
		super(value, place);
		// TODO Auto-generated constructor stub
	}
	public void Trigger() {
		this.getPlace().Add(this.getValue());
	}
}
