//import scanner to collect import from user
//collect imput from user
//set an if condition to print a position condition
//set an if condition to print a negative condition
//print out your result
import java.util.Scanner;
public class PositiveNumber{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number");
	int number = input.nextInt();
	
	if(number > 0){
		System.out.print("Postive number");
	}
	else{
		System.out.print("Negative number");
	}
	}
}
