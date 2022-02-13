//2) Build a custom annotation called @Info, which can be used by developers on a class, a
//property, or a method. The developer can provide the following information when using this
//annotation:
//a) AuthorID: <<Developers ID>> - (Mandatory Input)
//b) Author: <<Developers name>> - (Optional Input)
//c) Supervisor: <<Developers Supervisor>> - (Optional Input)
//d) Date: <<”String Date”>> - (Mandatory Input)
//e) Time: <<”String Time”>> - (Mandatory Input)
//f) Version: <<Numerical Version >> - (Mandatory Input)
//g) Description: <<Description of the class, method, or property >> - (Optional Input) 
@interface info {
	int AuthorID();

	String Author() default "Nitesh";

	String Supervisior() default "Amit";

	String Date();

	String Time();

	float Version();

	String Description() default "Custom annotation";
}

@info(AuthorID = 1, Date = "02/12/2022", Time = "07:57+ PM", Version = 0.1f, Description = "Applied on class")
class Annotation {
	@info(AuthorID = 2, Author = "Satyam", Date = "02/10/2022", Time = "07:59+ PM", Version = 0.2f, Description = "Applied on Method")
	public void AnnotationMethod() {
		@info(AuthorID = 3, Author = "Mohit", Date = "02/10/2022", Time = "08:01+ PM", Version = 0.2f, Description = "Applied on field")
		String string = "Hello";
		System.out.println("Annotation on Class, Method and Field");
	}
}

public class Question2 {
	public static void main(String[] args) {
		Annotation annotation = new Annotation();
		annotation.AnnotationMethod();
	}

}
