package command;

import mvc.Point;

public class UpdatePointCommand implements Command {

	Point point;
	Point newState;
	Point oldState = new Point(); // moramo da napravimo objekat da bi postojala!!
	
	public UpdatePointCommand(Point point, Point newState) {
		this.point = point;
		this.newState = newState;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		// samo pokazivaci menjaju gde pokazuju, ali objekat ostaje --> nije potpuno dobro resenje
		/*
		oldState = point;
		point = newState;
		*/
		// moramo da menjamo na nivou primitivnih obelezja
		oldState.setX(point.getX());
		oldState.setY(point.getY());
		oldState.setColor(point.getColor());
		
		point.setX(newState.getX());
		point.setY(newState.getY());
		point.setColor(newState.getColor());
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		//point = oldState;
		
		// menjamo na nivou primitivnih obelezja
		point.setX(oldState.getX());
		point.setY(oldState.getY());
		point.setColor(oldState.getColor());
	}

	
}
