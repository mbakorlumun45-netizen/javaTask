//import scanner to collect input from the user
//Collect imput from user
//initiate counter = 0
//initaite counter continuation
//comppute number to produce total
//iniate counter increment
//divide number and and assign to modulus
import java.util.Scanner;
public class Wednesday{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number");
	int number = input.nextInt();
	
	
	if(number % 7 == 0){
		System.out.print("Thursday");
		}
	else if(number % 7 == 2){
		System.out.print("Friday");
		}
		
	else if(number % 7 == 3){
		System.out.print("Saturday");
	}
	else if(number % 7 ==4){
		System.out.print("Sunday");
	}
	else if(number % 7 == 5){
		System.out.print("MOnday");
	}
	else if(number % 7 == 6){
		System.out.print("Tuesday");
	}
	
  }
  }
