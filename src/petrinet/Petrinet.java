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
	
	public void RemovePlace(Place p) {
		places.remove(p);
		for (Edge element :arcs) {
			if (p.equals(element.getPlace())) {
				arcs.remove(element)
			}
		}
		for (Transition transi :transitions) {
			for (Edge_in edge_in :transi.getListe_edge_in()) {
				if (p.equals(edge_in.getPlace())) {
					transi.getListe_edge_in().remove(edge_in)
				}
			}
			for (Edge_out edge_out :transi.getListe_edge_out()) {
				if (p.equals(edge_out.getPlace())) {
					transi.getListe_edge_out().remove(edge_out)
				}
			}
		}
	}
	
	
	public String affichage() {
		String res="Réseau de Petri \nNombre de Places : "+this.places.size();
		res= res+"\nNombre d'Arcs: "+this.arcs.size();
		res=res+"\nNombre de Transitions : "+this.transitions.size();
		String th="";
		for (Edge a : arcs) {
			th=th+a.affichage()+"\n";
			}
		for (Place p : places) {
			th=th+p.affichage()+"\n";
		}
		for (Transition t : transitions) {
			th=th+t.affichage()+"\n";
		}
		res=res+th
		return res;
	}
	

}
