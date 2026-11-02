package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

public class DrawingController {
	// pravimo konstruktor sa model i frame 
	DrawingModel model;
	DrawingFrame frame;
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		super();
		this.model = model;
		this.frame = frame;
	}
	
	// logika crtanja, treba nam za sve oblike u nasem projektu
	public void drawPoint(MouseEvent e) {
		Point p = new Point(e.getX(), e.getY(), Color.BLACK);
		model.add(p);
		frame.repaint(); // osvezavanje frame-a, da bi se nakon svake promene desilo to sto smo uradili
	}
}
