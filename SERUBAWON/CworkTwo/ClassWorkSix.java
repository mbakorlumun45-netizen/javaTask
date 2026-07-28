import java.util.Scanner;
public class ClassWorkSix{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int square = 0;
	
	for(int count = 1; count <= 20; count++){
	System.out.print("Enter  number");
	int number = input.nextInt();
	
	square = number * number;
	
	if(number <= 20){
		System.out.printf("square of numbers %d", square);
	}
	}
	
	}
}
