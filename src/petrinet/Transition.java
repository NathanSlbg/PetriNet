package petrinet;

import java.util.ArrayList;

public class Transition {

// Rajouter liste de edge_in et edge_out
	private int id;
	private ArrayList<Edge_in> liste_edge_in;
	private ArrayList<Edge_out> liste_edge_out;
	public Transition(int id) {
		this.id = id;
		liste_edge_in = new ArrayList<Edge_in>();
		liste_edge_out = new ArrayList<Edge_out>();
	}

	public void step() {
		boolean test = true;
		for (Edge_in element : liste_edge_in) {
			if (element.IsTriggerable()==false) {
				test=false;
			}
		if (test==true) {
			for (Edge_in edg_in : liste_edge_in) {
				edg_in.Trigger();
			}
			for (Edge_out edg_out : liste_edge_out) {
				edg_out.Trigger();
			}
		}
		}
	}
	
	public void ajouter_in(Edge_in edge_in) {
		liste_edge_in.add(edge_in);
	}
	public void ajouter_out(Edge_out edge_out) {
		liste_edge_out.add(edge_out);
	}
}
