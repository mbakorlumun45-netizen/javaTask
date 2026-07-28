//import scanner
//collect input as name and age
//print result in a straight line using print f
import java.util.Scanner;
public class SerubawonTwo{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter name");
	String name = input.nextLine();
	
	System.out.print("Enter age");
	int age = input.nextInt(); 
	 
	System.out.printf("Hello %s you are %d years old", name,age);
	
	}
}
