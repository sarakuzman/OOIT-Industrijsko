package geometry;

public class Test {

	public static void main(String[] args) {
		//Point p1 = new Point();
		//Point p2 = new Point();
		
		//p1.y = 50;
		//p1.selected = true;
		
		//System.out.println(p1.y);
		//System.out.println(p1.selected);
		
		//System.out.println(p2.x);
		
		//p2 = p1;
		//p1.x = 12;
		
		//System.out.println(p2.x);
		
		/*System.out.println(p1.getX());
		p1.setX(15);
		System.out.println(p1.getX());*/
		
		//VEZBE 4
		/*p1.setX(5);
		p1.setY(5);
		p2.setX(1);
		p2.setY(2);
		
		System.out.println(p1.distance(p2.getX(), p2.getY()));
		
		Line l1 = new Line();
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
		System.out.println(l1);
		System.out.println(l1.getEndPoint());
		System.out.println(l1.getEndPoint().getX());*/
		
		//Vezbe 5
		Point p1 = new Point(15,10,true);
		System.out.println(p1.getX());
		
		Line l1 = new Line(p1, new Point(5,5),false);
		Rectangle r1 = new Rectangle(new Point(50,50),20,20,true);
		
		
		
		//Podesiti x koordinatu gornje leve tacke pravougaonika na zbir vrednosti x koordinate pocetne
		// tacke linije l1 i y koordinate tacke p1
		
		r1.getUpperLeft().setX(l1.getStartPoint().getX() + p1.getY());
		System.out.println(p1);
		

	}

}
