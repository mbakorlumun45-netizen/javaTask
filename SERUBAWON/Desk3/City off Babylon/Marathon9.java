import java.util.Scanner;
public class Marathon9{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter four digits number");
	int number = input.nextInt();
	
	int lastDigit = number % 10;
	int numberThree = (number / 10) % 10;
	int numberOne = (number / 100) % 10;
	int numberTwo = (number / 1000) % 10;
	
	System.out.print(numberThree+ " ");
	System.out.print(numberTwo+ " ");
	System.out.print(numberThree+  " ");
	System.out.print(lastDigit+ " ");
	
	
	}

}
