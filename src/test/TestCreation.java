package test;

import petrinet.Edge_out;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.MethodOrderer.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import petrinet.Place;
import petrinet.Transition;

class TestCreation {
	
	@Test
	void testRemove() throws Exception{
		Place p1 = new Place(2);
		p1.remove(1);
		assertEquals(p1.getJeton(),1);
		p1.remove(2);
		assertEquals(p1.getJeton(),1);
	}
	@Test
	void testAdd() throws Exception{
		Place p1 = new Place(2);
		p1.add(2);
		assertEquals(p1.getJeton(),4);
		p1.add(-1);
		assertEquals(p1.getJeton(),3);
		
		
	}
	@Test
	void testCreerArc() throws Exception{
		Place p1 = new Place(2);
		Edge_out aSortant = new Edge_out(5,p1);
		assertEquals(aSortant.getValue(),5);
		Edge_out aSortant2 = new Edge_out(-1,p1);
		assertEquals(aSortant2.getValue(),-1);
	}
	@Test
	void testLierArc() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(2);
		Edge_out aSortant = new Edge_out(5,p1);
		t.ajouter_out(aSortant);
		assertEquals(t.getListe_edge_out().get(0),aSortant);
	}
	@Test
	void testArcDouble() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(2);
		Edge_out aSortant = new Edge_out(5,p1);
		Edge_out aSortant2 = new Edge_out(3,p1);
		t.ajouter_out(aSortant);
		t.ajouter_out(aSortant2);
		assertEquals(t.getListe_edge_out().get(0).getValue(),8);	
	}
	
	 void testRemovePlace() {
	    	Petrinet pn = new Petrinet();
	        Transition t = new Transition();
	        Place p1 = new Place(1);
	        Place p2 = new Place(2);
	        Place p3 = new Place(1);
	        Edge_in e0 = new Edge_in(1, p1);
	        Edge_in e1 = new Edge_in(1, p2);
	        Edge_in e2 = new Edge_out(1, p3);
	        t.ajouter_in(e0);
	        t.ajouter_in(e1);
	        t.ajouter_out(e2);
	        Petrinet.addPlace(p1);
	        Petrinet.addPlace(p2);
	        Petrinet.addPlace(p3);
	        Petrinet.addTransition(t);
	        Petrinet.addEdge(e0);
	        Petrinet.addEdge(e1);
	        Petrinet.addEdge(e2);
	        
	        Petrinet.RemovePlace(p1);
	        String texte="Réseau de Petri \nNombre de Places : 2 \nNombre d'Arcs: 2 \nNombre de Transitions : 1";
	        texte=texte+"\narc de poids 1 (place avec 2 jetons vers transition)";
	        texte=texte+"\narc de poids 1 (transition vers place avec 1 jetons)";
			texte=texte+"\nplace avec 2 jeton";
			texte=texte+"\nplace avec 1 jeton";
			texte=texte+"\ntransition, 2 arcs entrants, 1 arcs sortants";
			assertEquals(texte, Petrinet.affichage());
	    }

}
