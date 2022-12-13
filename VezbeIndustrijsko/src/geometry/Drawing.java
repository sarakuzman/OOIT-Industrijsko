package geometry;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	public void paint(Graphics g) {
		Point p1 = new Point(200,200);
		//p1.draw(g);
		Circle c1 = new Circle(p1,60);
		//c1.draw(g);
		p1.moveTo(400, 200);
		p1.draw(g);
		c1.draw(g);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(1000,600);
		frame.add(new Drawing());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public Drawing() {
		
	}
}
