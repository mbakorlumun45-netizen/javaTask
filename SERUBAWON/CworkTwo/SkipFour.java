import java.util.Scanner;
public class SkipFour{
	public static void main(String[] args){
	
	Scanner input = new Scanner("System.in");
	
	System.out.print("Enter number");
	int number = input.nextInt();
	
	for(int counter = 0; counter <= 10; counter++){
		System.out.print(counter+" * "+number+ "=" +(counter * number));
	}
	}
	}
