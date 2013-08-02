// Right-Angle Triangle as used in geometry

public class RightTriangle {
  public static double calcArea(int a, int b){
		return (a * b * 0.5);
	}

	public static int calcPerimeter(int a, int b, int c){
		return (a + b + c);
	}

	private double a;

	private double b;

	private double c;

	private double perimeter;

	private double area;

	public RightTriangle(double ai, double bi) {
		this.a = ai;
		this.b = bi;
		this.c = Math.sqrt( Math.pow(ai, 2 ) + Math.pow(bi, 2 ) );
		this.area = (ai * bi * 0.5);
		this.perimeter = (this.a + this.b + this.c);
	}
	public double getA() {
		return a;
	}
	public double getArea() {
		return area;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setC(double c) {
		this.c = c;
	}

}
