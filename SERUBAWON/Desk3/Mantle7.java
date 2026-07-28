import java.util.Scanner;
public class Mantle7{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first name: ");
	String firstname = input.next();
	
	System.out.print("Enter last name: ");
	String lastname = input.next();
	
	System.out.print("Enter studentid: ");
	String studentId = input.next();
	
	
	
	System.out.printf("firstName is: %s ", firstname);
	System.out.printf("lastName is: %s ", lastname);
	System.out.printf("The studentId is: %s", studentId);
	
	}
   }
