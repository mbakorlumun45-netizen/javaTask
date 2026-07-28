import java.util.Scanner;
public class AgainBy100{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number: ");
	int number = input.nextInt();
	
	for(int counter = 1; counter <= number; counter++){
		if(counter % 7==0){
			System.out.println(counter);
		}
	}
	}
}
