package mvc;

import java.util.ArrayList;

public class DrawingModel {
	private ArrayList<Shape> shapes = new ArrayList<Shape>(); // u nasem projektu ce biti lista oblika, a ne tacaka
	// tu listu imamo vec u projektu, pa mozemo samo to da stavimo u model
	
	// metode u array listi, te metode isto iz projekta stavljamo u model
	public void add(Shape s) {
		shapes.add(s);
	}
	
	public void remove(Shape s) {
		shapes.remove(s);
	}
	
	public void get(int index) {
		shapes.get(index);
	}
	
	public ArrayList<Shape> getShapes(){
		return shapes;
	}
}
