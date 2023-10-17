package petrinet;

import java.util.ArrayList;

public class Edge_in extends Edge{
	
	
	public Edge_in(int value, Place place) {
		super(value, place);
		// TODO Auto-generated constructor stub
	}
	
	public boolean IsTriggerable() {
		if (this.getValue()<= this.getPlace().getJeton()) {
			return true;
		}
		return false;
	}
	
	public void Trigger() {
		this.getPlace().Remove(this.getValue());
	}

}
