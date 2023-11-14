package petrinet;

public class Place {

	private int jeton;

	public Place(int jeton) {
		this.jeton = jeton;
	}

	public int getJeton() {
		return jeton;
	}

	public void remove(int value) {
		if (this.jeton >= value) {
			this.jeton = this.jeton - value;
		}
	}

	public void add(int value) {
		this.jeton = this.jeton + value;
	}

	public String affichage() {
		if (this.getJeton() == 0 || this.getJeton() == 1) {
			return "place avec " + this.getJeton() + " jeton";
		} else {
			return "place avec " + this.getJeton() + " jetons";
		}
	}

}
