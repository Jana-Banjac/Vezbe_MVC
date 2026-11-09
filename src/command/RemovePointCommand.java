package command;

import mvc.DrawingModel;
import mvc.Point;

public class RemovePointCommand implements Command {
	
	private Point point;
	private DrawingModel model;
	

	public RemovePointCommand(Point point, DrawingModel model) {
		super();
		this.point = point;
		this.model = model;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		model.remove(point);
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		model.add(point);
	}

}
