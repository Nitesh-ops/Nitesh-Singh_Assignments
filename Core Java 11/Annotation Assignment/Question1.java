import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//1) Create a custom annotation called @Test which can be only applied on a method implying
//that the following method is a test-case. (Is it possible to restrict the annotation to be
//applied only on a non-static method?) 

@Target(ElementType.METHOD)
@interface Test{}

class Animals{
	@Test
	public void lion() {
		System.out.println("@Test applied on Method here");
	}
}

public class Question1 {
	public static void main(String[] args) {
		Animals animals=new Animals();
		animals.lion();
	}

}
