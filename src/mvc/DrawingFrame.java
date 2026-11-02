package mvc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingFrame extends JFrame {
	
	// varijable pravimo van metode
	DrawingView view = new DrawingView();
	DrawingController controller;
	public DrawingFrame() {
		view.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// greska je da ovde pisemo ikakvulogiku!!!
				controller.drawPoint(e); // u projektu ce biti drawShape vrv
			}
		});
		
		//JPanel panel = new JPanel(); 
		getContentPane().add(view, BorderLayout.CENTER); // kada generisemo preko design taba umesto view ce pisati panel (zakomentarisan)
		// povezali DrawingView i DrawingFrame
		// add je veza izmedju frame i panel!!
	}
	public void setController(DrawingController controller) {
		this.controller = controller;
	}
	
}
