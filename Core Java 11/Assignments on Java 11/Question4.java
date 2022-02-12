import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

//4. Using features of Java 11, read the data from a text file (File name: StudentList.txt).
//Calculate the count of students and print the names as well as the total count of
//students on the screen. (If any line in file doesn’t contain a name, for such a record
//blank space should not be printed in the output)
//Hint: Use java 11 features of files and String methods to reduce the lines of code to
//be written. 

public class Question4 {
	public static void main(String[] args) {
		var filePath="C:\\Users\\Nitesh\\eclipse-workspace\\eclipse-workspace\\Assignments on Java 11\\src\\StudentList.txt";
		try {
			String dataString=Files.readString(Path.of(filePath));
			List<String> strlist=dataString.lines().collect(Collectors.toList());
			int count=0;
			for (String string : strlist) {
				if(string.isBlank())
				{
					continue;
				}
				System.out.println(string);
				count++;
			}
			System.out.println("\nTotal Number of students are : "+count);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
