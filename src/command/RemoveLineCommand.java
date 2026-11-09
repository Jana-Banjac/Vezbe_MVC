package command;

import mvc.DrawingModel;
import mvc.Line;

public class RemoveLineCommand implements Command {

	private Line line;
	private DrawingModel model;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		model.remove(line);
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		model.add(line);
	}

}
