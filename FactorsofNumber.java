import java.util.Scanner;
public class FactorsofNumber{
    public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number");
	int number = input.nextInt();
	
	for(int counter =2; counter <= number; counter++)
		if(counter % 2 == 0){
			System.out.print(counter);
		}	
  }	
 }
