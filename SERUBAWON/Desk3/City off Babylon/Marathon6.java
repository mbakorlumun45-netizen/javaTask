import java.util.Scanner;
public class Marathon6{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number");
	int number = input.nextInt();
	
	int remainder = 0;
	
	if(number > 7){
	  remainder = number % 1000 / 10; 
	  System.out.print("The number is even");   
	} 
	
	if(number == 7){
	  remainder = number % 100 / 10;
	  System.out.print("The number is even");
	}
	
	if(number < 7){
	  remainder = number % 10/ 10;
	  System.out.print("The number is odd");
	}
	
	}

}
