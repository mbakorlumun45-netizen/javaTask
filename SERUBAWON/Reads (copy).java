//import scanner collect imput
//collect input from user 
//initialize for a variable
//initialize loop to iterate the process
//put counter to add the number when input is not yet zero
//terminate loop when user input is zero
//printer couner total
import java.util.Scanner;
public class Reads{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number or 0 to quit");
	int number = input.nextInt();
	
	int total = 0;
		
	for(counter = 0; counter >= 0; counter++){
		if(counter >= 1){
			counter += number;
			number += total;
			}
			if(counter <= 0)
			System.out.printf("%d ", total);
		}
			
	}
	}

