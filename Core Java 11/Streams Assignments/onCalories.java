import java.util.Comparator;

public class onCalories implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
			Fruit  e1=(Fruit)o1;
			Fruit  e2=(Fruit)o2;
			Integer s1=e1.getCalories();
			Integer s2=e2.getCalories();
			return s2.compareTo(s1);
	}

}
