package geometry;

public class Point {

	private int x;
	private int y;
	private boolean selected;
	
	public double distance(int x, int y) {
		int dX = this.x- x;
		int dY = this.y - y;
		return Math.sqrt(dX*dX + dY*dY);
		}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
}
