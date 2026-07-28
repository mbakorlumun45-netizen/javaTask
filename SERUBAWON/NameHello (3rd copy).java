import java.util.Scanner;
public class NameHello{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.printf("Enter name");
	String name = input.nextLine();
	
	System.out.printf("Hello %s ", name);
	}
}
