//import scanner
//initialize variables
//collect input
//compute numbers together
//print out their sum
import java.util.Scanner;
public class SerubawonOne{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int sum1 = 0;
	int sum2 = 0;
	int sum3 = 0;
	
	System.out.print("Enter first integer");
	int number1 = input.nextInt();
	
	System.out.print("Enter first integer");
	int number2 = input.nextInt();
	
	System.out.print("Enter first integer");
	int number3 = input.nextInt();
	
	sum1 = number1 + number2 + number3;
	sum2 = number1 + number2 + number3;
	sum3 = number3 + number2 + number3;
	
	System.out.println("The sum is: " +sum1);
	System.out.println("The sum is: " +sum2);
	System.out.println("The sum is: " +sum3);
	}
}
