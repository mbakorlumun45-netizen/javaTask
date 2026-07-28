//impot scanner
//collect input celsius
//compute temperature with the value
//print out result fahrenheit
import java.util.Scanner;
public class SerubawonThree{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter temperature in celsius");
	double temperature = input.nextDouble();
	
	double F = 0;
	
	F = temperature / 33.8;
	
	System.out.println("Fahrenheit is: " +F); 
	
	
	}
}
