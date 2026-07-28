//import scanner to collect input from user
//collect input from user
//create two different variables 
//print the values 
//change the variables and and print
import java.util.Scanner;
public class Integers{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number1");
	int number1 = input.nextInt();
	
	System.out.print("enter number2");
	int number2 = input.nextInt();
	
	if(number1 > number2){
		System.out.printf("%d  %d", number1, number2);
	}

	}
	}
