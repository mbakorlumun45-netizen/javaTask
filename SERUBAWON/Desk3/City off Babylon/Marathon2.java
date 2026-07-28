import java.util.Scanner;
public class Marathon2{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int number = input.nextInt();
	
	int cube = number * number * number;
	
	
	if(number > 500 && cube > 500){
	   System.out.printf("%d is greater than 500%n", number);
	}
	if(number == 500 && cube == 500){
	     System.out.printf("%d is equal to 500%n", number);
	}
	if(number < 500 && cube < 500){
	       System.out.printf("%d is less than 500%n", number);
	}
	
	System.out.println("product of cube" + cube);
	}
}
