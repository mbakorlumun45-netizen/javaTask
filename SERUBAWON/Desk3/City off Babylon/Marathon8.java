import java.util.Scanner;
public class Marathon8{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter value of length");
	int length = input.nextInt();
	
	System.out.print("Enter value of width");
	int width = input.nextInt();
	
	int perimeter = length * length + width * width;
	
	int product = length * width;
	
	int sum = length + width;
	
	System.out.print("perimeter of length && width  "  +perimeter);
	
	System.out.print("product of area length && width  " +product);
	
	System.out.print("sum of diagonal length && width  " +sum);
	
	}

} 
