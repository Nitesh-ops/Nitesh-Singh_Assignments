abstract class Shape {
	String shape;
}

abstract class triangle extends Shape {
	public abstract void draw();
}

class equilateral extends triangle {

	@Override
	public void draw() {
		System.out.println("Example of abstract class");
	}
}

public class Assignment2Q4 {
	public static void main(String[] args) {
		triangle tri = new equilateral();
		tri.draw();
	}

}
