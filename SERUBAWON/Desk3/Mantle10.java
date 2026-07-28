import java.util.Scanner;
public class Mantle10{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = input.nextInt();
	
	int square = number * number;
	int cube = number * number * number;
	
	System.out.println("square of number " + square);
	System.out.println("cube of number " + cube);
	}
	}
