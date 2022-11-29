package geometry;

public class Circle {

	private Point center;
	private int radius;
	private boolean selected;
	
	public double area() {
		return radius*radius*Math.PI;
	}
	
	public double circumference() {
		return radius*2*Math.PI;
	}
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Center: " + center + ", radius: " + radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle temp = (Circle)obj;
			if(this.center.equals(temp.getCenter()) &&
					this.radius == temp.getRadius()) {
				return true;
			}
		}
		return false;
	}
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
}
