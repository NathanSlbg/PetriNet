package test;

import petrinet.Edge_out;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.MethodOrderer.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import petrinet.Place;
import petrinet.Transition;

@TestMethodOrder(MethodOrderer.MethodName.class)
class TestCreation {

	@Test
	/*On teste la possibilité de retirer des jetons à une place dans deux cas: l'un où on retire moins de jeton que ce que la place a et inversement
	 * On s'attend à ce que le second cas ne change pas le nombre de jeton*/
	void test1Remove() throws Exception {
		Place p1 = new Place(2);
		p1.remove(1);
		assertEquals(p1.getJeton(), 1);
		p1.remove(2);
		assertEquals(p1.getJeton(), 1);
	}

	@Test
	/*On teste la possibilité d'ajouter des jetons à une place dans deux cas: l'un où ajoute un nombre négatif puis positif
	 * On s'attend à ce qu'on considère bien la valeur absolu de l'entier*/
	void test2Add() throws Exception {
		Place p1 = new Place(2);
		p1.add(2);
		assertEquals(p1.getJeton(), 4);
		p1.add(-1);
		assertEquals(p1.getJeton(), 3);

	}

	@Test
	/*On teste la création d'un arc avec un poids positif puis négatif
	 * A l'écriture de ce commentaire un arc négatif peut exister (à changer)*/
	void test3CreerArc() throws Exception {
		Place p1 = new Place(2);
		Edge_out aSortant = new Edge_out(5, p1);
		assertEquals(aSortant.getValue(), 5);
		Edge_out aSortant2 = new Edge_out(-1, p1);
		assertEquals(aSortant2.getValue(), -1);
	}

	@Test
	/*On teste que l'arc existe bien dans la liste d'arcs appartenant à une transition*/
	void test4LierArc() throws Exception {
		Transition t = new Transition();
		Place p1 = new Place(2);
		Edge_out aSortant = new Edge_out(5, p1);
		t.ajouter_out(aSortant);
		assertEquals(t.getListe_edge_out().get(0), aSortant);
	}

	@Test
	/*On teste que si on a un arc double, la valeur de l'arc présent dans une transition correspond à la somme de la valeur des deux arcs (on ne rajoute pas un autre arc)*/
	void test5ArcDouble() throws Exception {
		Transition t = new Transition();
		Place p1 = new Place(2);
		Edge_out aSortant = new Edge_out(5, p1);
		Edge_out aSortant2 = new Edge_out(3, p1);
		t.ajouter_out(aSortant);
		t.ajouter_out(aSortant2);
		assertEquals(t.getListe_edge_out().get(0).getValue(), 8);
	}

}
