import java.util.Scanner;
public class Monday29{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter destination");
	String name = input.next();
	
	System.out.print("Enter distance to destination");
	int distance = input.nextInt();
	
	System.out.print("Enter fuel price per litre");
	int price = input.nextInt();
	
	System.out.print("Enter litre per mile");
	int litre = input.nextInt();
	
	
	int fuelneeded = distance * litre;
	int totalcost = fuelneeded * price;
	int splitcost = totalcost / 2; 
	
	
	System.out.printf("The fuel needed to destination: %s", fuelneeded);
	
	System.out.printf("The total cost of fuel is: %d", totalcost);
	
	System.out.printf("The split cost of fuel is: %d", splitcost);
	
	}
    }
