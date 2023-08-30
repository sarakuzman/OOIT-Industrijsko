package drawing;

public class Test {

	public static void main(String[] args) {
		//Point p1= new Point();
		//System.out.println(p1);
		

		Line l1 = new Line();
		Point p1= new Point(1,1);
		Point p2= new Point(2,2);
		l1.setStart(p1);
		l1.setEnd(p2);
		l1.setSelected(false);
		System.out.println(l1);
		
		
		Line l2 = new Line(new Point(3,3), new Point(4,4));
		l2.setSelected(false);
		System.out.println(l2);
		
		Line l3= new Line(new Point (5,5), new Point(6,6), false);
		System.out.println(l3);
		
		Rectangle r1 =  new Rectangle();
		r1.setUpperLeftPoint(new Point(5,5));
		r1.setWidth(10);
		r1.setHeight(20);
		r1.setSelected(false);
		System.out.println(r1);
		
		Rectangle r2= new Rectangle(new Point(5,5),10,20);
		System.out.println(r2);
		
		Rectangle r3= new Rectangle(new Point(5,5),10,20,false);
		System.out.println(r3);
		
		Circle c1=new Circle();
		c1.setCenter(new Point(5,5));
		c1.setRadius(10);
		c1.setSelected(false);
		System.out.println(c1);
		
		Circle c2=new Circle(new Point(5,5),10);
		System.out.println(c2);
		
		Circle c3= new Circle(new Point(5,5),10,false);
		System.out.println(c3);
		
		Donut d1=new Donut ();
		d1.setCenter(new Point(5,5));
		d1.setRadius(10);
		d1.setInnerRadius(5);
		System.out.println(d1);
		
		Donut d2= new Donut(new Point(5,5),10,5);
		System.out.println(d2);
		
		Donut d3= new Donut(new Point(5,5),10,5,false);
		System.out.println(d3);
	}
}
