package petrinet;

public class main {
	public static void main(String[] args) {
		
		Place place1 = new Place(4);
		Place place2 = new Place(2);
		Place place3 = new Place(5);
		Place place4 = new Place(3);
		
		Transition transition = new Transition();
		
		Edge_in edge_in1 = new Edge_in(3,place1);
		Edge_in edge_in2 = new Edge_in(3,place2);
		
		transition.ajouter_in(edge_in1);
		transition.ajouter_in(edge_in2);
		
		Edge_out edge_out1 = new Edge_out(2,place3);
		Edge_out edge_out2 = new Edge_out(1,place4);
		
		transition.ajouter_out(edge_out1);
		transition.ajouter_out(edge_out2);
		
		System.out.println("Place 1 :"+place1.getJeton());
		System.out.println("Place 2 :"+place2.getJeton());
		System.out.println("Place 3 :"+place3.getJeton());
		System.out.println("Place 4 :"+place4.getJeton());
		
		transition.step();
		
		System.out.println("Place 1 :"+place1.getJeton());
		System.out.println("Place 2 :"+place2.getJeton());
		System.out.println("Place 3 :"+place3.getJeton());
		System.out.println("Place 4 :"+place4.getJeton());
			
	}
}
