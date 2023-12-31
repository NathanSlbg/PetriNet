package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import petrinet.Edge_in;
import petrinet.Edge_out;
import petrinet.Petrinet;
import petrinet.Place;
import petrinet.Transition;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)

class TestAffichage {

	@Test
	@Order(1)
	/*On teste le bon affichage d'une place en faisant varier le nombre de jetons (distinction avec le pluriel sur jeton)*/
	void testAffichePlace() {
		Place p = new Place(1);
		assertEquals("place avec 1 jeton", p.affichage());
		Place p2 = new Place(2);
		assertEquals("place avec 2 jetons", p2.affichage());
	}

	@Test
	@Order(2)
	/*On teste le bon affichage d'une transition en faisant varier le nombre et le type d'arcs reliés*/
	void testAfficheTransition() {
		Transition t = new Transition();
		Place p = new Place(2);
		assertEquals("transition, 0 arcs entrants, 0 arcs sortants", t.affichage());
		Edge_in eI = new Edge_in(2, p);
		t.ajouter_in(eI);
		assertEquals("transition, 1 arcs entrants, 0 arcs sortants", t.affichage());
		Edge_out eO = new Edge_out(3, p);
		t.ajouter_out(eO);
		assertEquals("transition, 1 arcs entrants, 1 arcs sortants", t.affichage());
	}

	@Test
	@Order(3)
	/*On teste le bon affichage d'un arc d'abord entrant puis sortant*/
	void testAfficheArc() {
		Place p = new Place(2);
		Edge_in e = new Edge_in(2, p);
		assertEquals("arc de poids 2 (place avec 2 jetons vers transition)", e.affichage());
		Edge_out eO = new Edge_out(3, p);
		// Assure-toi que super.getPlace() est accessible depuis la classe de test
		assertEquals("arc de poids 3 (transition vers place avec 2 jetons)", eO.affichage());
	}

	@Test
	@Order(4)
	/*On teste le bon affichage d'un réseau de Petri composé d'une transition, de trois places et de trois arcs (2 entrants et 1 sortant)*/
	void testAfficheReseau() {

		Petrinet pn = new Petrinet();
		Transition t = new Transition();
		Place p1 = new Place(1);
		Place p2 = new Place(2);
		Place p3 = new Place(1);
		Edge_in e0 = new Edge_in(1, p1);
		Edge_in e1 = new Edge_in(1, p2);
		Edge_out e2 = new Edge_out(1, p3);
		t.ajouter_in(e0);
		t.ajouter_in(e1);
		t.ajouter_out(e2);
		pn.addPlace(p1);
		pn.addPlace(p2);
		pn.addPlace(p3);
		pn.addTransition(t);
		pn.addEdge(e0);
		pn.addEdge(e1);
		pn.addEdge(e2);

		String texte = "Réseau de Petri \nNombre de Places : 3\nNombre d'Arcs: 3\nNombre de Transitions : 1";
		texte = texte + "\narc de poids 1 (place avec 1 jetons vers transition)";
		texte = texte + "\narc de poids 1 (place avec 2 jetons vers transition)";
		texte = texte + "\narc de poids 1 (transition vers place avec 1 jetons)";
		texte = texte + "\nplace avec 1 jeton";
		texte = texte + "\nplace avec 2 jetons";
		texte = texte + "\nplace avec 1 jeton";
		texte = texte + "\ntransition, 2 arcs entrants, 1 arcs sortants";
		assertEquals(texte, pn.affichage());
	}
	
	@Test
	@Order(5)
	/*On teste la possibilité de retirer une place d'un réseau de Petri en vérifiant qu'elle n'a plus de lien avec aucun arc ni aucune transition*/
	void testRemovePlace() {
		Petrinet pn = new Petrinet();
		Transition t = new Transition();
		Place p1 = new Place(1);
		Place p2 = new Place(2);
		Place p3 = new Place(1);
		Edge_in e0 = new Edge_in(1, p1);
		Edge_in e1 = new Edge_in(1, p2);
		Edge_out e2 = new Edge_out(1, p3);
		t.ajouter_in(e0);
		t.ajouter_in(e1);
		t.ajouter_out(e2);
		pn.addPlace(p1);
		pn.addPlace(p2);
		pn.addPlace(p3);
		pn.addTransition(t);
		pn.addEdge(e0);
		pn.addEdge(e1);
		pn.addEdge(e2);

		pn.RemovePlace(p1);
		String texte = "Réseau de Petri \nNombre de Places : 2 \nNombre d'Arcs: 2 \nNombre de Transitions : 1";
		texte = texte + "\narc de poids 1 (place avec 2 jetons vers transition)";
		texte = texte + "\narc de poids 1 (transition vers place avec 1 jetons)";
		texte = texte + "\nplace avec 2 jeton";
		texte = texte + "\nplace avec 1 jeton";
		texte = texte + "\ntransition, 2 arcs entrants, 1 arcs sortants";
		assertEquals(texte, pn.affichage());
	}

}
