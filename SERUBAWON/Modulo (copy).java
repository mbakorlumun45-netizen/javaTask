import java.util.Scanner;
public class Modulo{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number");
	int number = input.nextInt();
	
	for(int counter = 0; counter < number; counter++){
	int remainder = number % 10;
	number = number / 10;
		System.out.println(remainder);
	 }
	}
}
