package j2se;

//Main2.java
public class Cube {
	int length;
	int breadth;
	int height;

	public int getCubeVolume() {
		return (length * breadth * height);
	}

	public Cube() {
		// TODO Auto-generated constructor stub
		length = 10;
		breadth = 20;
		height = 30;
	}

	public Cube(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
	}
}// class
// Main2.java
