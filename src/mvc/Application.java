package mvc;

import javax.swing.JFrame;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dobro dosli");
		
		// mvc struktura
		DrawingModel model = new DrawingModel(); // kreiran model
		DrawingFrame frame = new DrawingFrame(); 
		// ne mozemo da pravimo view ovde jer je view samo panel koji iscrtava oblike (panel ne pravimo u application)
		// u frame pravimo, kada pozovemo frame napravice se i panel tj view!!
		frame.view.setModel(model); // model koji postoji u view je isti objekat kao i ovde
		DrawingController controller = new DrawingController(model, frame); // prosledjujemo model i frame da znamo tacno s cime radimo
		frame.setController(controller); // controller koji postoji u frame je isti objekat kao i ovde
		
		// ovo imamo na projektu, ali nam, treba da podesimo frame
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
