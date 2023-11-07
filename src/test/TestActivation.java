package src.test;

import src.petrinet.Edge_in;
import src.petrinet.Edge_out;
import src.petrinet.Place;
import src.petrinet.Transition;

public class TestActivation {
	
	public static void main(String[] args) throws Exception {
		System.out.println("Test de la situation 1");
		test1();
		
		
	
		
	}
	
	public static void test1() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_in e = new Edge_in(0,p1);
		t.ajouter_in(e);
		t.step();
	}
	
	public static void test2() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_in e = new Edge_in(1,p1);
		t.ajouter_in(e);
		t.step();
	} 
	public static void test3() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_in e = new Edge_in(2,p1);
		t.ajouter_in(e);
		t.step();
	}
	public static void test4() throws Exception{
		Transition t = new Transition();
		t.step();
	}
	public static void test5() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(0);
		Edge_out e = new Edge_out(1,p1);
		t.ajouter_out(e);
		t.step();
	}
	public static void test6() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_out eO = new Edge_out(1,p1);
		Place p2 = new Place(1);
		Edge_in eI = new Edge_in(2,p2);
		t.ajouter_out(eO);
		t.ajouter_in(eI);
		t.step();
	}
	public static void test7() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_out eO = new Edge_out(1,p1);
		Place p2 = new Place(1);
		Edge_in eI = new Edge_in(1,p2);
		t.ajouter_out(eO);
		t.ajouter_in(eI);
		t.step();
	}
	public static void test8() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(1);
		Edge_in e1 = new Edge_in(1,p1);
		Place p2 = new Place(1);
		Edge_in e2 = new Edge_in(2,p2);
		t.ajouter_in(e1);
		t.ajouter_in(e2);
		t.step();
	}
	public static void test9() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(2);
		Edge_in e1 = new Edge_in(1,p1);
		Place p2 = new Place(1);
		Edge_in e2 = new Edge_in(1,p2);
		t.ajouter_in(e1);
		t.ajouter_in(e2);
		t.step();
	}
	
	
	
	

}
