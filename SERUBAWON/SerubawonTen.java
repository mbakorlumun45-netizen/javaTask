//import scanner to collect input
//collect imput from user
//
import java.util.Scanner;
public class SerubawonTen{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first name");
	String firstName = input.nextLine();
	
	System.out.print("Enter last name");
	String lastName = input.nextLine();
	
	System.out.print("Enter year of birth");
	int year = input.nextInt();
	
	System.out.printf("Hello %s %s you are %d years old", firstName, lastName, year);
	
	}

}
