
package petrinet;

public class Edge {

	private int value;
	private Place place;

	public Edge(int value, Place place) {
		if (value<=0) {
			System.out.println("La valeur de l'arc doit être positive");
			this.value=Math.abs(value);
		}
		else {
			this.value = value;
			}
		this.place = place;
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
		this.value = value;
	}

	public String affichage() {
		return "arc de poids " + this.getValue();
	}

}
