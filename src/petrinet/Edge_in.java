
package petrinet;

public class Edge_in extends Edge {

	public Edge_in(int value, Place place) {
		super(value, place);
		// TODO Auto-generated constructor stub
	}

	public boolean IsTriggerable() {
		// vérifie que la valeur de l'arc et inéfieur aux nombres de jetons de la place
		if (this.getValue() <= this.getPlace().getJeton()) {
			return true;
		}
		return false;
	}

	public void Trigger() {
		// retire le nombre de jetons correspondant à la valeur de l'arc
		this.getPlace().remove(this.getValue());
	}

	public String affichage() {
		return "arc de poids " + this.getValue() + " (place avec " + super.getPlace().getJeton()
				+ " jetons vers transition)";
	}
}
