package circle;

import java.util.Scanner;

interface AreaCal {
	void circle();
}

class AreaOfCircle000 implements AreaCal {
	double area;

	public void circle(double r) {
		area = (22 * r * r) / 7;
	}

	public static void main(String args[]) {
		AreaOfCircle x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius:");
		double rad = s.nextDouble();
		x = new AreaOfCircle();
		x.circle(rad);
		System.out.println("Area of Circle is: " + x.area);
	}

	public void circle() {
		// TODO Auto-generated method stub
		
	}
}