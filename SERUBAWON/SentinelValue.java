import java.util.Scanner;
public class SentinelValue{
    public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number 0r -1 to Quit");
	int number = input.nextInt();
	
	int sum = 0;
	double average = 0;
	int counter = 1;
	
	while( counter != -1){
		sum = sum + number;
		number = number + 1;
		counter++;
		
		System.out.print("Enter number or -1 to Quit");
		number = input.nextInt();
		
		if(sum != 0){
			average = (double)sum / counter;
		}
		System.out.print("The average is " +average);
	}
  }
}
