package geometry;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	public void paint(Graphics g) {
		Point p1 = new Point(200,200);
		Line l1 = new Line(p1, new Point(500,400));
		Rectangle r1 = new Rectangle(p1,50,50);
		Circle c1 = new Circle(p1,60);
		Donut d1 = new Donut(new Point(600,700),40,20);
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(p1);
		shapes.add(l1);
		shapes.add(r1);
		shapes.add(c1);
		shapes.add(d1);
		
		//iscrtavanje prvog elementa
		shapes.get(0).draw(g);
		//iscrtavanje poslednjeg elementa
		shapes.get(shapes.size()-1).draw(g);
		//izbacivanje drugog elementa sa liste
		shapes.remove(1);
		shapes.get(1).draw(g);
		
		for(Shape s: shapes) {
			//iscrtavanje samo krugova(ukljucujuci i donut)
			if(s instanceof Circle) {
				s.draw(g);
			}
			//iscrtavanje pravougaonika
			else if(s instanceof Rectangle) {
				s.draw(g);
			}
		}
		
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
