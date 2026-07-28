import java.util.Scanner;
public class Mantle6{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter amount: ");
	double amount = input.nextDouble();
	
	System.out.print("Enter rate: ");
	double rate= input.nextDouble();
	
	System.out.print("Enter time: ");
	double time = input.nextDouble();
	
	double simpleInterest = amount * rate * time;
	double interest = simpleInterest / 100;
	
	System.out.println("The result is: " + interest);	
	System.out.println("The simpleInterest is: " + simpleInterest);
		
	}
	
   }
