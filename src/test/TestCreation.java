package test;

import petrinet.Edge_out;
import petrinet.Place;
import petrinet.Transition;

public class TestCreation {
	
	public static void main(String[] args) throws Exception {
		System.out.println("Test de la méthode remove");
		testRemove();
		System.out.println("Test de la méthode add");
		testAdd();
		System.out.println("Test de la création d'arc");
		testCreerArc();
		System.out.println("Test du lien d'un arc et d'une transition");
		testLierArc();
	
		
	}
	
	public static void testRemove() throws Exception{
		Place p1 = new Place(2);
		p1.remove(1);
		System.out.println("La place p1 a maintenant "+p1.getJeton()+" jetons");
		p1.remove(2);
		System.out.println("La place p1 a maintenant "+p1.getJeton()+" jetons");
	}
	
	public static void testAdd() throws Exception{
		Place p1 = new Place(2);
		p1.add(2);
		System.out.println("La place p1 a maintenant "+p1.getJeton()+" jetons");
		p1.add(-1);
		System.out.println("La place p1 a maintenant "+p1.getJeton()+" jetons");
		
		
	}
	public static void testCreerArc() throws Exception{
		Place p1 = new Place(2);
		Edge_out aSortant = new Edge_out(5,p1);
		System.out.println(aSortant.toString());
		Edge_out aSortant2 = new Edge_out(-1,p1);
		System.out.println(aSortant2.toString());
	}
	public static void testLierArc() throws Exception{
		Transition t = new Transition();
		Place p1 = new Place(2);
		Edge_out aSortant = new Edge_out(5,p1);
		t.ajouter_out(aSortant);
		for (Edge_out e : t.getListe_edge_out()) {
			System.out.println(e.toString());
		}
	}

}
