//import scanner
//collect imput
//compute distance with kilometres
//print result in kilometers
import java.util.Scanner;
public class SerubawonFiveteen{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	double kilometres = 0;
	System.out.print("Enter distance in miles");
	double distance = input.nextDouble();
	
	kilometres = distance * 1.60934;
	
	System.out.printf("Miles is: %.2f in kilometres", kilometres);  
	
	}
}
