//import scanner to collect input from user
//collect input from user
//set username to the programed name
//set password to the programed number
//create feedback of the action
import java.util.Scanner;
public class UserPassword{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	 System.out.print("Enter username");
	 String user = input.nextLine();
	 
	 System.out.print("Password");
	 int password = input.nextInt();
	 
	 if(user.equals("ADMIN")){
	 	if(password == 1234){
	 		System.out.print("Access granted");
	 	}
	 	}else{
	 		System.out.print("Access denied");
	 }
	 
	}
}
