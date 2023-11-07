package test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import petrinet.Edge_in;
import petrinet.Edge_out;
import petrinet.Petrinet;
import petrinet.Place;
import petrinet.Transition;

class TestAffichage_ {
	
	@Test
	void testAffichePlace() {
		Place p=new Place(1);
		assertEquals(p.affichage(),"place avec 1 jeton");
		Place p2 = new Place(2);
		assertEquals(p2.affichage(),"place avec 2 jetons");
	}
	@Test
	void testAfficheTransition() {
		Transition t = new Transition();
		Place p=new Place(2);
		assertEquals(t.affichage(),"transition, "+0+" arcs entrants, "+0+" arcs sortants");
		Edge_in eI = new Edge_in(2,p);
		t.ajouter_in(eI);
		assertEquals(t.affichage(),"transition, "+1+" arcs entrants, "+0+" arcs sortants");
		Edge_out eO = new Edge_out(3,p);
		t.ajouter_out(eO);
		assertEquals(t.affichage(),"transition, "+1+" arcs entrants, "+1+" arcs sortants");
	}
	@Test
	void testAfficheArc() {
		Place p = new Place(3);
		Edge_in e =new Edge_in(2,p);
		assertEquals(e.affichage(),"arc de poids 2 (place avec 3 jetons vers transition)");
		Edge_out eO = new Edge_out(3,p);
		
		assertEquals(eO.affichage(),"arc de poids 3 (transition vers place avec 3 jetons)");
	}
	@Test
	void testAfficheReseau() {
		Petrinet pn = new Petrinet();
		
	}

}
