package segment;

public class Point {
	private double x;
	private double y;
	private double z;
	
	public Point (double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double longueur (Point p) {
		return Math.sqrt(Math.pow((getX()-p.getX()), 2) + Math.pow((getY()-p.getY()), 2) + Math.pow((getZ()-p.getZ()), 2));
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	public String toString () {
		return "P(" + x + ", " + y + ", " + z + ")";
	}
}
