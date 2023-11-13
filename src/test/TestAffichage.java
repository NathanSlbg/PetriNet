package src.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.class)
class TestAffichage {

    @Test
    @Order(1)
    void testAffichePlace() {
        Place p = new Place(1);
        assertEquals("place avec 1 jeton", p.affichage());
        Place p2 = new Place(2);
        assertEquals("place avec 2 jetons", p2.affichage());
    }

    @Test
    @Order(2)
    void testAfficheTransition() {
        Transition t = new Transition();
        assertEquals("transition, 0 arcs entrants, 0 arcs sortants", t.affichage());
        Edge_in eI = new Edge_in(2);
        t.ajouter_in(eI);
        assertEquals("transition, 1 arcs entrants, 0 arcs sortants", t.affichage());
        Edge_out eO = new Edge_out(3);
        t.ajouter_out(eO);
        assertEquals("transition, 1 arcs entrants, 1 arcs sortants", t.affichage());
    }

    @Test
    @Order(3)
    void testAfficheArc() {
        Edge_in e = new Edge_in(2);
        assertEquals("arc de poids 2", e.affichage());
        Edge_out eO = new Edge_out(3);
        // Assure-toi que super.getPlace() est accessible depuis la classe de test
        assertEquals("arc de poids 3 (place avec " + super.getPlace().getJeton() + " jetons vers transition)", eO.affichage());
    }

    @Test
    @Order(4)
    void testAfficheReseau() {
    	
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
        
        String texte="Réseau de Petri \nNombre de Places : 2 \nNombre d'Arcs: 2 \nNombre de Transitions : 1";
        texte=texte+"\narc de poids 1 (place avec 2 jetons vers transition)";
        texte=texte+"\narc de poids 1 (transition vers place avec 1 jetons)";
		texte=texte+"\nplace avec 2 jeton";
		texte=texte+"\nplace avec 1 jeton";
		texte=texte+"\ntransition, 2 arcs entrants, 1 arcs sortants";
		assertEquals(texte, Petrinet.affichage());
		}
    
    void testRemove() {
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
        // Ajoute tes assertions pour tester l'affichage du réseau ici
}

