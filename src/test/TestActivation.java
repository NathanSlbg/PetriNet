package src.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.MethodOrderer.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import src.petrinet.Edge_in;
import src.petrinet.Edge_out;
import src.petrinet.Place;
import src.petrinet.Transition;

class TestActivation {
	
	@Test
	void test1() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_in e = new Edge_in(0,p1);
		t.ajouter_in(e);
		t.step();
		assertEquals(p1.getJetons(),1);
	}
	@Test
	void test2() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_in e = new Edge_in(1,p1);
		t.ajouter_in(e);
		t.step();
		assertEquals(p1.getJetons(),0);
	} 
	
	@Test
	void test3() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_in e = new Edge_in(2,p1);
		t.ajouter_in(e);
		t.step();
		assertEquals(p1.getJetons(),1);
	}
	@Test
	void test4() throws Exception{
		Transition t = new Transition();
		t.step();
	}
	@Test
	void test5() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(0);
		Edge_out e = new Edge_out(1,p1);
		t.ajouter_out(e);
		t.step();
		assertEquals(p1.getJetons(),1);
	}
	@Test
	void test6() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_out eO = new Edge_out(1,p1);
		Place p2 = new Place(1);
		Edge_in eI = new Edge_in(2,p2);
		t.ajouter_out(eO);
		t.ajouter_in(eI);
		t.step();
		assertEquals(p1.getJetons(),1);
		assertEquals(p2.getJetons(),1);
	}
	@Test
	void test7() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_out eO = new Edge_out(1,p1);
		Place p2 = new Place(1);
		Edge_in eI = new Edge_in(1,p2);
		t.ajouter_out(eO);
		t.ajouter_in(eI);
		t.step();
		assertEquals(p1.getJetons(),2);
		assertEquals(p2.getJetons(),0);
	}
	@Test
	void test8() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_in e1 = new Edge_in(1,p1);
		Place p2 = new Place(1);
		Edge_in e2 = new Edge_in(2,p2);
		t.ajouter_in(e1);
		t.ajouter_in(e2);
		t.step();
		assertEquals(p1.getJetons(),1);
		assertEquals(p2.getJetons(),1);
	}
	@Test
	void test9() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(2);
		Edge_in e1 = new Edge_in(1,p1);
		Place p2 = new Place(1);
		Edge_in e2 = new Edge_in(1,p2);
		t.ajouter_in(e1);
		t.ajouter_in(e2);
		t.step();
		assertEquals(p1.getJetons(),1);
		assertEquals(p2.getJetons(),0);
	}
	
	void test10() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_in e1 = new Edge_in(3,p1);
		Place p2 = new Place(1);
		Edge_in e2 = new Edge_in(2,p2);
		t.ajouter_in(e1);
		t.ajouter_in(e2);
		t.step();
		assertEquals(p1.getJetons(),1);
		assertEquals(p2.getJetons(),1);
	}
	
	
	
	

}
