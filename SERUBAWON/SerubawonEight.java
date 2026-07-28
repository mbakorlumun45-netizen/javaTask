
//impot scanner to collect input from user
//collect input from user
//initialize variable to compute the area of the circle
//calculate the area of the circle using the formula
//print the result in 2 decimal places
import java.util.Scanner;
public class SerubawonEight{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	int result = 0;

	System.out.print("Enter radius of the circle");
	int radius = input.nextInt();

	result = radius * radius;

	System.out.printf("The result is: %d ", result);
	}
}
