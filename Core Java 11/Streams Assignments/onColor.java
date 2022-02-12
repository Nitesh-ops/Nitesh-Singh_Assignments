import java.util.Comparator;

public class onColor implements Comparator<Fruit> {
	@Override
	public int compare(Fruit o1, Fruit o2) {
		Fruit  e1=(Fruit)o1;
		Fruit  e2=(Fruit)o2;
		String s1=e1.getColor();
		String s2=e2.getColor();
		return s1.compareTo(s2);
	}

}
