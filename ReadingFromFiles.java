import java.util.*;
import java.io.*;


public class ReadingFromFiles {
	public static void main(String[] args) throws FileNotFoundException {

		//Scanner Class - read file line by line in Java using Scanner
        FileInputStream fis = new FileInputStream("C:\\Users\\LG\\Desktop\\PSU_191\\CS102\\Java_Code\\Week_7\\persons_data.txt");
        Scanner scanner = new Scanner(fis);
     	String line = "";
     	StringTokenizer tokens;
     	String name, gender;
     	int age;
        //reading file line by line using Scanner in Java
        System.out.println("Reading file line by line in Java using Scanner");
     	
     	Person[] pers = new Person[100];
     	int count = 0;
        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            tokens = new StringTokenizer(line, " ");
            name = tokens.nextToken() + " " + tokens.nextToken();
            gender = tokens.nextToken();
            age = Integer.parseInt(tokens.nextToken());
        //    System.out.println("Person info: name = " + name + ", gender = " + gender + " is " + age + " years old.");
            pers[count] = new Person(name, gender, age);
            count++;
        }

        for(int i = 0; i < count; i++)
        	System.out.println(pers[i]);

	}
}