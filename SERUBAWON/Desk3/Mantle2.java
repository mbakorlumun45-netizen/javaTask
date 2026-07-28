import java.util.Scanner;
public class Mantle2{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first integer");
	int number1 = input.nextInt();
	
	System.out.print("Enter second integer");
	int number2 = input.nextInt();
	
	System.out.print("Eneter third integer");
	int number3 = input.nextInt();
	
	int total = number1 + number2 + number3;
	double average = total / 3;
	
	System.out.print("total of number1, number2, number3 is" +total);
	System.out.print("average of total" +average);
	
	}

}
