import java.util.Scanner;
public class SentinelValuee{
    public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int sum = 0;

	while(true) {
	System.out.print("Enter number or -1 to Quit");
	   int number = input.nextInt();
	    
	 if(number == -1) {
	     sum += number;
	     System.out.print("Sum of alll values " + sum);
	     break;
	    }
	}
	}
	}
