//import scanner to collect input from user
//collect imput as age
//create conditions for age ranges
//print feedback according to the conditions
import java.util.Scanner;
public class Selection{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter age");
	int age = input.nextInt();
	
	if(age < 13){
		System.out.print("child");
	}
	if(age >= 13 - 17){
		System.out.print("Teenager");	
	}
	if(age >= 18 - 64){
		System.out.print("Adult");
	}
	else if(age >= 65){
		System.out.print("Senior");
	}
	}
	
}
