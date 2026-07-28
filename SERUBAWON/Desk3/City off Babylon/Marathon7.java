import java.util.Scanner;
public class Marathon7{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int number1 = input.nextInt();
	
	System.out.println("Enter second number");
	int number2 = input.nextInt();
	
	int sum = number1 + number2;
	
	int result = number1 * number1; 
	int cube = number2 * number2 * number2;
	
	
	System.out.println("sum of number1 && number2"  +sum);
	
	System.out.println("result of number1"  +result);
	
	System.out.println("cube of number2"  +cube);
	
	if(result == 0){
	  System.out.print("It is not a multiple");
	}
	
	if(cube != 0){
	  System.out.print("It is not a multiple");
	}
	
     }
  }
