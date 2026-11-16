package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import command.AddPointCommand;
import composite.Snowflake;

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
	// testiranje mvc i command obrasca
	public void drawPoint(MouseEvent e) {
		Point p = new Point(e.getX(), e.getY(), Color.BLACK);
		// MVC deo
		// model.add(p);
		// Command deo
		AddPointCommand addPointCommand = new AddPointCommand(p, model);
		addPointCommand.execute(); // NAD OBJEKTOM
		frame.repaint(); // osvezavanje frame-a, da bi se nakon svake promene desilo to sto smo uradili
	}
	
	// testiranje composite obrasca - 2. korak
	public void drawComposite(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		
		// pravim proizvoljan oblik 
		// ovde pahulju --> trebaju 3 linije
		Line line1 = new Line(
				new Point(x-40, y, Color.BLUE),
				new Point(x+40, y, Color.BLUE),
				Color.BLUE);
		Line line2 = new Line(
				new Point(x-20, y-35, Color.BLUE),
				new Point(x+20, y+35, Color.BLUE),
				Color.BLUE);
		Line line3 = new Line(
				new Point(x-20, y+35, Color.BLUE),
				new Point(x+20, y-35, Color.BLUE),
				Color.BLUE);
		
		Snowflake snowflake = new Snowflake();
		snowflake.add(line1);
		snowflake.add(line2);
		snowflake.add(line3);
		
		model.add(snowflake);
		// zakomentarisan kod je ono sto treba da bude u projektu
		// AddShapeCommand addShapeCommand = new AddShapeCommand(model, snowflake);
		// addShapeCommand.execute();
		frame.repaint();
	}
}
