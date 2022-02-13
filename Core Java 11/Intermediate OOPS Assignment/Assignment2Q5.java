class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	return "Drawing Rectangle";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	return "Drawing Line";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	return "Drawing Cube";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) {
    	Rectangle5 rc=new Rectangle5();
    	System.out.println(rc.draw());
    	Line5 Li=new Line5();
    	System.out.println(Li.draw());
    	Cube5 cu=new Cube5();
    	System.out.println(cu.draw());
    	
    }
}