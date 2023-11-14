package test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import petrinet.Edge_in;
import petrinet.Edge_out;
import petrinet.Place;
import petrinet.Transition;

@TestMethodOrder(MethodOrderer.MethodName.class)
class TestActivation {
	
	/* On teste à chaque fois l'activation du réseau de Petri en regardant si les places ont le bon nombre final de jeton

	@Test
	/*Une transition, une place avec 1 jeton et un arc entrant de poids 0
	 * On s'attend à ce que la place garde le même nombre de jeton*/
	void test1() throws Exception {
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_in e = new Edge_in(0, p1);
		t.ajouter_in(e);
		t.step();
		assertEquals(p1.getJeton(), 1);
	}
	
	
	@Test
	/*Une transition, une place avec 1 jeton et un arc entrant de poids 1
	 * On s'attend à ce que la place perde 1 jeton*/
	void test2() throws Exception {
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_in e = new Edge_in(1, p1);
		t.ajouter_in(e);
		t.step();
		assertEquals(p1.getJeton(), 0);
	}

	@Test
	/*Une transition, une place avec 1 jeton et un arc entrant de poids 2
	 * On s'attend à ce que la place garde le même nombre de jeton car on ne peut pas lui en retirer 2*/
	void test3() throws Exception {
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_in e = new Edge_in(2, p1);
		t.ajouter_in(e);
		t.step();
		assertEquals(p1.getJeton(), 1);
	}

	@Test
	/*Une transition, pas encore de test trouvé*/
	void test4() throws Exception {
		Transition t = new Transition();
		t.step();
	}

	@Test
	/*Une transition, une place avec 0 jeton et un arc sortant de poids 1
	 * On s'attend à ce que la place récupère un jeton*/
	void test5() throws Exception {
		Transition t = new Transition();
		Place p1 = new Place(0);
		Edge_out e = new Edge_out(1, p1);
		t.ajouter_out(e);
		t.step();
		assertEquals(p1.getJeton(), 1);
	}

	@Test
	/*Une transition, deux places avec 1 jeton chacune et deux arcs, un entrant de poids 2 et un sortant de poids 1
	 * On s'attend à ce que les deux places gardent le même nombre de jeton*/
	void test6() throws Exception {
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_out eO = new Edge_out(1, p1);
		Place p2 = new Place(1);
		Edge_in eI = new Edge_in(2, p2);
		t.ajouter_out(eO);
		t.ajouter_in(eI);
		t.step();
		assertEquals(p1.getJeton(), 1);
		assertEquals(p2.getJeton(), 1);
	}

	@Test
	/*Une transition, deux places avec 1 jeton chacune et deux arcs, un entrant de poids 1 et un sortant de poids 1
	 * On s'attend à ce qu'une place perde un jeton et une autre place en récupère un*/
	void test7() throws Exception {
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_out eO = new Edge_out(1, p1);
		Place p2 = new Place(1);
		Edge_in eI = new Edge_in(1, p2);
		t.ajouter_out(eO);
		t.ajouter_in(eI);
		t.step();
		assertEquals(p1.getJeton(), 2);
		assertEquals(p2.getJeton(), 0);
	}

	@Test
	/*Une transition, deux places avec 1 jeton chacune et deux arcs entrants de poids 1
	 * On s'attend à ce que les deux places gardent le même nombre de jeton*/
	void test8() throws Exception {
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_in e1 = new Edge_in(1, p1);
		Place p2 = new Place(1);
		Edge_in e2 = new Edge_in(2, p2);
		t.ajouter_in(e1);
		t.ajouter_in(e2);
		t.step();
		assertEquals(p1.getJeton(), 1);
		assertEquals(p2.getJeton(), 1);
	}

	@Test
	/*Une transition, deux places avec 1 jeton et deux jetons et deux arcs entrants de poids 1
	 * On s'attend à ce que les deux places perdent un jeton*/
	void test9() throws Exception {
		Transition t = new Transition();
		Place p1 = new Place(2);
		Edge_in e1 = new Edge_in(1, p1);
		Place p2 = new Place(1);
		Edge_in e2 = new Edge_in(1, p2);
		t.ajouter_in(e1);
		t.ajouter_in(e2);
		t.step();
		assertEquals(p1.getJeton(), 1);
		assertEquals(p2.getJeton(), 0);
	}
	@Test
	/*Une transition, deux places avec 1 jeton chacune et deux arcs entrants de poids 3 et 2
	 * On s'attend à ce que les deux places gardent le même nombre de jeton*/
	void test10() throws Exception {
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_in e1 = new Edge_in(3, p1);
		Place p2 = new Place(1);
		Edge_in e2 = new Edge_in(2, p2);
		t.ajouter_in(e1);
		t.ajouter_in(e2);
		t.step();
		assertEquals(p1.getJeton(), 1);
		assertEquals(p2.getJeton(), 1);
	}

}
