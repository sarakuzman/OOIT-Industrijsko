package drawing;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JPanel;

public class PnlDrawing extends JPanel implements MouseListener {



	static int obj=0;
	int mx,my;
	private Point startLine;
	static ArrayList<Shape> shapesArrList= new ArrayList<Shape>();
	
	public PnlDrawing () {
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		mx=e.getX();
		my=e.getY();
		
		switch(obj){
		case 1 :
				Point p = new Point(mx,my,false);
				shapesArrList.add(p);
			break;
			
		case 2:
				if (startLine==null) {
					startLine = new Point(mx,my,false);
					
				}else {
					Point endLine = new Point(mx,my);
					Line line = new Line(startLine,endLine,false);
					shapesArrList.add(line);
					startLine=null;
				}
			break;
			
		case 3:
			DlgRectangle dlgRectangle = new DlgRectangle();
			dlgRectangle.getTxtXCoord().setText(String.valueOf(mx));
			dlgRectangle.getTxtXCoord().setEditable(false);
			dlgRectangle.getTxtYCoord().setText(String.valueOf(my));
			dlgRectangle.getTxtYCoord().setEditable(false);
			dlgRectangle.setVisible(true);
				
			if(dlgRectangle.isOk==true) {
				
				Rectangle r = new Rectangle (
						new Point (mx,my),
						Integer.parseInt(dlgRectangle.getTxtWidth().getText()),
						Integer.parseInt(dlgRectangle.getTxtHeight().getText()),
						false);
						System.out.println(r);
						shapesArrList.add(r);
			}
			
			break;
		
		case 4:
			DlgCircle dlgCircle = new DlgCircle();
			dlgCircle.getTxtXCoord().setText(String.valueOf(mx));
			dlgCircle.getTxtYCoord().setText(String.valueOf(my));
			dlgCircle.getTxtXCoord().setEditable(false);
			dlgCircle.getTxtYCoord().setEditable(false);
			dlgCircle.setVisible(true);
			
			if(dlgCircle.isOk==true){
				Circle c = new Circle (new Point (mx,my),
						Integer.parseInt (dlgCircle.getTxtRadius().getText()),
						false);
						shapesArrList.add(c);
				
			}
			break;
			
			
		case 5:
			DlgDonut dlgDonut=new DlgDonut();
			dlgDonut.getTxtXCoord().setText(String.valueOf(mx));
			dlgDonut.getTxtYCoord().setText(String.valueOf(mx));
			dlgDonut.getTxtXCoord().setEditable(false);
			dlgDonut.getTxtYCoord().setEditable(false);
			dlgDonut.setVisible(true);

			if(dlgDonut.isOk==true){
				Donut d = new Donut (new Point (mx,my),
						Integer.parseInt (dlgDonut.getTxtRadius().getText()),
						Integer.parseInt (dlgDonut.getTxtInnerRadius().getText()),
						false);
						shapesArrList.add(d);
				
			}
			break;
			
		case 6:
			boolean match=false;
			Collections.reverse(shapesArrList);
			for(Shape shape : shapesArrList) {
				shape.setSelected(false);
				if(match==false) {
					if(shape.contains(mx, my)) {
						shape.setSelected(true);
						match=true;
					}
				}
			}
			
			Collections.reverse(shapesArrList);
			break;

		}
		
	}

	public void paint(Graphics g) {
		super.paint(g);
		for(Shape shape : shapesArrList) {
			shape.draw(g);
		}
		repaint();
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

	

