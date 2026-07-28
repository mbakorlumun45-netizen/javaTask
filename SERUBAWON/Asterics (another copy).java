import java.util.Scanner;
public class Asterics{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	
	int counter = 0;
	
	System.out.print("Enter rows");
	int rows = input.nextInt();
	
	System.out.print("Enter columns");
	int colums = input.nextInt();
	
	while(counter <= rows){
		System.out.print("*");
			counter++;
		while(counter <= colums){
			//System.out.print("*");
				counter++;
		}
		System.out.print("*");
	}
	}

}
