package composite;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import mvc.Shape;

public class Snowflake extends Shape {

	// struktura kompozicije - 1. korak
	ArrayList<Shape> snowflake = new ArrayList<Shape>();
	
	// dodavanje i brisanje
	public void add(Shape s) {
		snowflake.add(s);
	}
	
	public void delete(Shape s) {
		snowflake.remove(s);
	}
	
	// iscrtavamo dok god imamo jos oblika u nasoj kompoziciji
	// ovo se nalazi u DrawingView
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		Iterator<Shape> it = snowflake.iterator();
		while(it.hasNext()) {
			it.next().draw(g);
		}
	}
	
}
