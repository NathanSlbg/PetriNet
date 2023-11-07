package petrinet;

import java.util.ArrayList;

public class Petrinet {
	
	private ArrayList<Edge> arcs;
	private ArrayList<Place> places;
	private ArrayList<Transition> transitions;

	
	public Petrinet() {
		this.arcs= new ArrayList<Edge>();
		this.places=new ArrayList<Place>();
		this.transitions=new ArrayList<Transition>();
	}
	
	public void addPlace(Place p) {
		places.add(p);
	}
	public void addTransition(Transition t) {
		transitions.add(t);
	}
	public void addEdge(Edge e) {
		arcs.add(e);
	}
	public void affichage() {
		System.out.println("Réseau de Petri");
		System.out.println("Nombre de Places : "+this.places.size());
		System.out.println("Nombre d'Arcs: "+this.arcs.size());
		System.out.println("Nombre de Transitions : "+this.transitions.size());
		for (Edge a : arcs) {
			System.out.println(a.affichage());
			}
		for (Place p : places) {
			System.out.println(p.affichage());
		}
		for (Transition t : transitions) {
			System.out.println(t.affichage());
		}
	}
	

}
