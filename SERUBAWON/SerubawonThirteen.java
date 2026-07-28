//import scanner
//initialize varaibles for the values
//collect input from user
//compte subtotal to get grandtotal
//print result in grandtotoal
import java.util.Scanner;
public class SerubawonThirteen{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	double grandTotal = 0;
	double subTotal =0;
	
	System.out.print("item price");
	double price = input.nextDouble();
	
	System.out.print("quantity");
	double quantity = input.nextDouble();
	
	System.out.print("Enter vat");
	double vat = input.nextDouble();
	
	subTotal = price * quantity;
	vat = subTotal * 0.20;
	
	grandTotal = subTotal + vat;
	
	System.out.print("The grand total is: " +grandTotal);
	}
}
