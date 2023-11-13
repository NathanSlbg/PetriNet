package petrinet;

public class Edge_out extends Edge {

	public Edge_out(int value, Place place) {
		super(value, place);
		// TODO Auto-generated constructor stub
	}

	public void Trigger() {
		this.getPlace().add(this.getValue());
	}

	public String affichage() {
		return "arc de poids "+this.getValue()+" (transition vers place avec "+super.getPlace().getJeton()+" jetons)";
	}

}
