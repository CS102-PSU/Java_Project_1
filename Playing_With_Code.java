/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;


public class Main {
	public static void main(String[] args) throws FileNotFoundException {
      
	//Scanner Example - read file line by line in Java using Scanner
        FileInputStream fis = new FileInputStream("C:/sample.txt");
        Scanner scanner = new Scanner(fis);
     
        //reading file line by line using Scanner in Java
        System.out.println("Reading file line by line in Java using Scanner");
     
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());

Read more: https://javarevisited.blogspot.com/2012/07/read-file-line-by-line-java-example-scanner.html#ixzz62FeBSIGj

        StringTokenizer st = new StringTokenizer("Ahmed Ali#male#34", "#");
        
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());

        char letterA = 'a';
        int letter_unicodeA = letterA;
        System.out.println("Unicode value of " + letterA + " = " + letter_unicodeA);
        
        char letterZ = 'z';
        int letter_unicodeZ = letterZ;
        System.out.println("Unicode value of " + letterZ + " = " + letter_unicodeZ);
        
        for(int i = 'a'; i <= 'z'; i++)
            System.out.print("Unicode of " + (char) i + " = " + i + "\t");
            
        System.out.println(create_random_name(10));
	}

	public static String create_random_name(int num_chars) {
	    String name = "";
	    Random rand = new Random();
	    char letter = ' ';
	    
	    for(int i = 0; i < num_chars; i++) {
	        letter = (char) (rand.nextInt((122 - 97) + 1) + 97); // Random numbers between 97 and 122 INCLUSIVE
	        name = name.concat(Character.toString(letter));
	    }
	    
	    return(name);
	}

}