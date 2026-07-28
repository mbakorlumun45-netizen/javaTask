import java.util.Scanner;
public class Divisible2{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number");
	int number = input.nextInt();
	
	for(int counter =0; counter <= number; counter++){
		if(counter % 3 == 0 && counter % 5 == 0){
			System.out.println(counter);
		}
	}
	}
}

