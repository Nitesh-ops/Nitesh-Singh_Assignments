class SingletonInheritanceCheck {
	private static SingletonInheritanceCheck single_instance = null;
	public String str;

	private SingletonInheritanceCheck() {
		str = "Hello this is constructor from singleton class";
	}

	public static SingletonInheritanceCheck SingletonInheritanceCheck() {
		if (single_instance == null) {
			single_instance = new SingletonInheritanceCheck();
		}
		return single_instance;
	}

}

public class Assignment2Q1 {
	public static void main(String[] args) {
		SingletonInheritanceCheck x = SingletonInheritanceCheck.SingletonInheritanceCheck();
		SingletonInheritanceCheck y = SingletonInheritanceCheck.SingletonInheritanceCheck();
		SingletonInheritanceCheck z = SingletonInheritanceCheck.SingletonInheritanceCheck();
		System.out.println("Hashcode of x is " + x.hashCode());
		System.out.println("Hashcode of y is " + y.hashCode());
		System.out.println("Hashcode of z is " + z.hashCode());
		if (x == y && y == z) {
			System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
		}

		else {
			System.out.println("Three objects DO NOT point to the same memory location on the heap");
		}
	}

}