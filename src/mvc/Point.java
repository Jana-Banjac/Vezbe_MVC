package mvc;

import java.awt.Color;
import java.awt.Graphics;

public class Point {
	private int x, y;
	private Color color;
	
	
	// konstruktori
	public Point() {
		
	}
	
	public Point(int x, int y, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	// predstavljamo tacku kao krstic/iksic (mali oblik, ali mora da se vidi)
	public void draw(Graphics g) {
		g.drawLine(x-2, y-2, x+2, y+2);
		g.drawLine(x+2, y-2, x-2, y+2);
		g.setColor(color);
	}
	
	// getteri i setteri
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}

	// jedno od resenja za tekstualno polje
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", color=" + color + "]";
	}
	
}
