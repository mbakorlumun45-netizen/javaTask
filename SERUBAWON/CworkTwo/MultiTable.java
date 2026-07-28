import java.util.Scanner;

public class MultiTable{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("Enter number:  ");
	int number = input.nextInt();

	for(int counter = 1; counter <= 9; counter++){
	
		System.out.println(number + " * " + counter + " = " +(number * counter));
	
	}

}
}
