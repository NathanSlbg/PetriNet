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

}
