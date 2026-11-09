package command;

import mvc.Line;

public class UpdateLineCommand implements Command {

	Line line;
	Line newState;
	Line oldState = new Line();
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		oldState.getStartPoint().setX(line.getStartPoint().getX());
		oldState.getStartPoint().setY(line.getStartPoint().getY());
		oldState.getEndPoint().setX(line.getEndPoint().getX());
		oldState.getEndPoint().setY(line.getEndPoint().getY());
		oldState.setColor(line.getColor());
		
		line.getStartPoint().setX(newState.getStartPoint().getX());
		line.getStartPoint().setY(newState.getStartPoint().getY());
		line.getEndPoint().setX(newState.getEndPoint().getX());
		line.getEndPoint().setY(newState.getEndPoint().getY());
		line.setColor(newState.getColor());
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		line.getStartPoint().setX(oldState.getStartPoint().getX());
		line.getStartPoint().setY(oldState.getStartPoint().getY());
		line.getEndPoint().setX(oldState.getEndPoint().getX());
		line.getEndPoint().setY(oldState.getEndPoint().getY());
		line.setColor(oldState.getColor());
	}

}
