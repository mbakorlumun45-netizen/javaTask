import java.util.Scanner;
public class Marathon1 {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number1: ");
	int number1 = input.nextInt();
	
	System.out.print("Enter second number2: ");
	int number2 = input.nextInt();
	
	int cube1=number1*number1*number1;
	int cube2=number2*number2*number2;
	int product = cube1 * cube2;
	int remainder = 0;
	
	if(cube1 > cube2){
		remainder = cube1 / cube2;
	}
	if(cube2 > cube1){
		remainder = cube2 / cube1;
	}
	
	System.out.printf("Cube of first number: %d%nCube of second number: %d%n", cube1, cube2);
	//System.out.printf("Cube of second number: %d%nCube of first number: %d%n", cube2, cube1);
	
	System.out.println("The product of " + cube1 + " and " + cube2 + " is " + product);
	System.out.println("The remiander is " + remainder);javac
	
	
	
	
	
      }
    }

