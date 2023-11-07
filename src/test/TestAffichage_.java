import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAffichage_ {
	
	void testAffichePlace() {
		Place p=new Place(1);
		assertEquals(p.affichage(),"place avec 1 jeton");
		Place p2 = new Place(2);
		assertEquals(p2.affichage(),"place avec 2 jetons");
	}
	
	void testAfficheTransition() {
		Transition t = new Transition();
		assertEquals(t.affichage(),"transition, "+0+" arcs entrants, "+0+" arcs sortants");
		Edge_in eI = new Edge_in(2);
		t.ajouter_in(eI);
		assertEquals(t.affichage(),"transition, "+1+" arcs entrants, "+0+" arcs sortants");
		Edge_out eO = new Edge_out(3);
		t.ajouter_out(eO);
		assertEquals(t.affichage(),"transition, "+1+" arcs entrants, "+1+" arcs sortants");
	}
	
	void testAfficheArc() {
		Edge_in e =new Edge_in(2);
		assertEquals(e.affichage(),"arc de poids "+2);
		Edge_out eO = new Edge_out(3);
		assertEquals(e0.affichage(),"arc de poids 3 (place avec "+super.getPlace().getJeton()+" jetons vers transition")
	}
	void testAfficheReseau() {
		Petrinet pn = new Petrinet();
		
	}

}
