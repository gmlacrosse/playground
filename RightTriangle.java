// Right-Angle Triangle as used in geometry

public class RightTriangle {
	public static double calcArea(double a, double b) {
		return (a * b * 0.5);
	}

	@Override
	public String toString() {
		return "RightTriangle [a=" + a + ", b=" + b + ", c=" + c
				+ ", perimeter=" + perimeter + ", area=" + area + "]";
	}

	public static double calcPerimeter(double ai, double bi) {
		double c = Math.sqrt(Math.pow(ai, 2) + Math.pow(bi, 2));
		return (ai + bi + c);
	}

	private double a;

	private double b;

	private double c;

	private double perimeter;

	private double area;

	public RightTriangle(double ai, double bi) {
		this.a = ai;
		this.b = bi;
		this.c = Math.sqrt(Math.pow(ai, 2) + Math.pow(bi, 2));
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

	// when a is set update the calculations
	public void setA(double a) {
		this.a = a;
		this.c = Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
		this.area = (this.a * this.b * 0.5);
		this.perimeter = (this.a + this.b + this.c);
	}

	// when b is set update the calculations
	public void setB(double b) {
		this.b = b;
		this.c = Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
		this.area = (this.a * this.b * 0.5);
		this.perimeter = (this.a + this.b + this.c);
	}
}
