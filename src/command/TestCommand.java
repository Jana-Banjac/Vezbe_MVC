package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Point;

// ovo ne pravimo u projektu nego menjamo u kontroleru
public class TestCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(10, 10, Color.BLACK);
		DrawingModel model = new DrawingModel();
		
		// testiranje dodavanja tacke
		AddPointCommand addPointCommand = new AddPointCommand(p1, model);
		addPointCommand.execute();
		System.out.println(model.getShapes());
		
		// testiranje brisanja tacke
		RemovePointCommand removePointCommand = new RemovePointCommand(p1, model);
		removePointCommand.execute();
		
		// testiranje ponistavanja brisanja tacke
		removePointCommand.unexecute();
		
		// testiranje izmene tacke
		Point p2 = new Point(20, 20, Color.RED);
		
		UpdatePointCommand updatePointCommand = new UpdatePointCommand(p1, p2);
		updatePointCommand.execute();
		System.out.println(model.getShapes());
		
		// testiranje ponistavanja izmene tacke
		updatePointCommand.unexecute();
		System.out.println(model.getShapes());
	}

}
