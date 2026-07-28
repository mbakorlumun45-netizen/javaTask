import java.util.Scanner;
public class ClassWorkSeven{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int cube = 0;
	
	for(int count = 1; count <= 10; count++){
	System.out.print("Enter  number");
	int number = input.nextInt();
	
	cube = number * number * number;
	
	if(number <= 10){
		System.out.printf("cube of numbers %d", cube);
	}
	}
	
	}
}
