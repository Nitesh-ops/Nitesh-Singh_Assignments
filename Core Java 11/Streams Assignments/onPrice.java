import java.util.Comparator;

public class onPrice implements Comparator<Fruit> {
	@Override
	public int compare(Fruit o1, Fruit o2) {
		Fruit  e1=(Fruit)o1;
		Fruit  e2=(Fruit)o2;
		Integer s1=e1.getPrice();
		Integer s2=e2.getPrice();
		return s1.compareTo(s2);
	}

}