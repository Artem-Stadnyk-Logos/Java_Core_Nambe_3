package ua.Mk;

public class Rectangle {

	private double a;
	private double b;
	
	Rectangle (double a, double b) {
		this.a = a;
		this.b = b;
	}
	Rectangle (){
		this.a=15;
		this.b=23;
	}
	double Perimeter;
	double Square;

	public double Perimeter ()
	 {
	 return 2 * (a + b);
	 }
	 public double Square ()
	 {
	 return a * b;
	 }
	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + ", Perimeter()=" + Perimeter() + ", Square()=" + Square() + "]";
	}
	
}