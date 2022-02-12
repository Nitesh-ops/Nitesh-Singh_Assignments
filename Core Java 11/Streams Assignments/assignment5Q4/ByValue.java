package assignment5Q4;

import java.util.Comparator;

public class ByValue implements Comparator<Transaction> {

	@Override
	public int compare(Transaction o1, Transaction o2) {
		Transaction  e1=(Transaction)o1;
		Transaction  e2=(Transaction)o2;
		Integer s1=e1.getValue();
		Integer s2=e2.getValue();
		return s1.compareTo(s2);
	}
	

}
