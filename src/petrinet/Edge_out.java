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
<<<<<<< HEAD
		return "arc de poids "+this.getValue()+" (transition vers place avec "+super.getPlace().getJeton()+" jetons)";
		}
	
=======
		return "arc de poids " + this.getValue() + " (transition vers place avec " + super.getPlace().getJeton()
				+ " jetons)";
	}
>>>>>>> 313f3b4a04d4568ae9567abf155ac2464c0e95ad
}
