package command;

public interface Command {
	public void execute();
	public void unexecute();
	
	// trebaju nam klase za svaku od komandi koje cemo koristit
}
