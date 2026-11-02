package mvc;

import java.awt.Graphics;
import java.util.Iterator;

import javax.swing.JPanel;

public class DrawingView extends JPanel {

	// los, lokalizovan model, jer je model vec u application
	// DrawingModel model = new DrawingModel(); 
	// bukv napravili novi model, a to necemo
	// svakako nam treba veza sa modelom, ali ne sme da bude nov objekat
	
	// IZUZETAK osnove mvc strukture jer nama treba objekat kada se pokrece view u DrawingFrame
	// vec u sledecoj liniji koda se model setuje na onaj iz application
	DrawingModel model = new DrawingModel();

	// metoda za crtanje oblika u panelu
	public void paint(Graphics g) {
		Iterator<Point> it = model.getShapes().iterator();
		while(it.hasNext()) {
			it.next().draw(g);
		}
	}
	
	public void setModel(DrawingModel model) {
		this.model = model;
	}
	
}
