package ua.Mk;

public class Colo {

	private double radius;
	private double diametr;
	
	Colo (double radius, double diametr) {
		this.radius = radius;
		this.diametr = diametr;
	}
	Colo (){
		this.radius=15;
		this.diametr=2*radius;
	}
	
	double area;
	double circumference;
	public double area ()
	 {
	 return area = 3.14 * (radius * radius);
	 }
	 public double circumference ()
	 {
	 return circumference= 3.14 * 2*radius;
	 }
	@Override
	public String toString() {
		return "Colo [radius=" + radius + ", diametr=" + diametr + ", area()=" + area() + ", circumference()="
				+ circumference() + "]";
	}
	
}
