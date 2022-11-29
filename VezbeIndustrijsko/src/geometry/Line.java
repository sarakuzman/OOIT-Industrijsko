package geometry;

public class Line {

	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public Line() {
		
	}
	
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}
	
	@Override
	public String toString() {
		return "("+startPoint.getX() + ", " + startPoint.getY()+ ") ------> " + 
				"(" + endPoint.getX() + ", " + endPoint.getY() + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Line) {
			Line temp = (Line)obj;
			if(this.startPoint.equals(temp.getStartPoint())
					&& this.endPoint.equals(temp.getEndPoint())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean contains(int x, int y) {
		return (length()- (this.startPoint.distance(x, y)+
				this.endPoint.distance(x, y))) <= 2;
	}
	
	public boolean contains(Point p) {
		return contains(p.getX(),p.getY());
	}
	
	public double length() {
		return startPoint.distance(endPoint.getX(), endPoint.getY());
	}
	
	public Point getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
}
