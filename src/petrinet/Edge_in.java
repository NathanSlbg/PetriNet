package petrinet;

public class Edge_in extends Edge {

	public Edge_in(int value, Place place) {
		super(value, place);
		// TODO Auto-generated constructor stub
	}

	public boolean IsTriggerable() {
		if (this.getValue() <= this.getPlace().getJeton()) {
			return true;
		}
		return false;
	}

	public void Trigger() {
		this.getPlace().remove(this.getValue());
	}

	public String affichage() {
		return "arc de poids " + this.getValue() + " (place avec " + super.getPlace().getJeton()
				+ " jetons vers transition)";
	}
}
