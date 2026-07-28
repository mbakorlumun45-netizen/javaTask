import java.util.Scanner;
public class Mantle9{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first name");
	String firstName = input.next();
	
	System.out.print("Enter last name");
	String lastName = input.next();
	
	String name = firstName + lastName;
	//String name = lastName;
	
	System.out.printf("Hello %s %s:", firstName , lastName);
	
     }
   }
