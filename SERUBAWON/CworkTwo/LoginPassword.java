import java.util.Scanner;
public class LoginPassword{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	

	String userName = "";
	
	int password = 1234;

	int userPassword = 0;
	
	int counter = 0;
	
	do {
	System.out.println("Enter username");
	userName = input.next();
	
	System.out.println("Enter password");
	userPassword = input.nextInt();
	
	if (userName == userName && userPassword == password){
			System.out.println("Login successfully");
			
			}
			else{
				System.out.println("wrong credentials");
				counter++;
				}
			}
		while (counter < 10);
		if (counter == 10){
		System.out.println("No more login Attempts");
		}
	
				
				
		
		
			}		
}
