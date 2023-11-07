package src.petrinet;

import java.util.ArrayList;

public class Transition {

// Rajouter liste de edge_in et edge_out
	private ArrayList<Edge_in> liste_edge_in;
	private ArrayList<Edge_out> liste_edge_out;
	public Transition() {
		liste_edge_in = new ArrayList<Edge_in>();
		liste_edge_out = new ArrayList<Edge_out>();
	}

	public void step() {
		boolean test = true;
		for (Edge_in element : liste_edge_in) {
			if (element.IsTriggerable()==false) {
				test=false;
			}
		}
		if (test==true) {
			for (Edge_in edg_in : liste_edge_in) {
				edg_in.Trigger();
			}
			for (Edge_out edg_out : liste_edge_out) {
				edg_out.Trigger();
			}
		}
		else {
			System.out.println("La transition n'est pas tirable");
		}
	}
	
	public void ajouter_in(Edge_in edge_in) {
		boolean res=true;
		for (Edge_in e : liste_edge_in) {
			if (e.getPlace()==edge_in.getPlace()) {
				e.setValue(edge_in.getValue()+e.getValue());
				res=false;
			}
		}
		if(res) {
		liste_edge_in.add(edge_in);}
	}
	public void ajouter_out(Edge_out edge_out) {
		boolean res=true;
		for (Edge_out e : liste_edge_out) {
			if (e.getPlace()==edge_out.getPlace()) {
				e.setValue(edge_out.getValue()+e.getValue());
				res=false;
			}
		}
		if(res) {
		liste_edge_out.add(edge_out);}
	}

	/**
	 * @return the liste_edge_in
	 */
	public ArrayList<Edge_in> getListe_edge_in() {
		return liste_edge_in;
	}

	/**
	 * @return the liste_edge_out
	 */
	public ArrayList<Edge_out> getListe_edge_out() {
		return liste_edge_out;
	}
	
	public String affichage() {
		return "transition, "+liste_edge_in.size()+" arcs entrants, "+liste_edge_out.size()+" arcs sortants";
	}
}
