package mvc;

import java.util.ArrayList;

public class DrawingModel {
	private ArrayList<Point> points = new ArrayList<Point>(); // u nasem projektu ce biti lista oblika, a ne tacaka
	// tu listu imamo vec u projektu, pa mozemo samo to da stavimo u model
	
	// metode u array listi, te metode isto iz projekta stavljamo u model
	public void add(Point p) {
		points.add(p);
	}
	
	public void remove(Point p) {
		points.remove(p);
	}
	
	public void get(int index) {
		points.get(index);
	}
	
	public ArrayList<Point> getShapes(){
		return points;
	}
}
