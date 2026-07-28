//import scanner
//collect input
//create conditional statement
//use if statement to arrange the ages according to age range
//print out result base on range
import java.util.Scanner;
public class StudentScore{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter score");
	int score = input.nextInt();
	
	for(int counter = 0; counter <= 50; counter++){
		if(score >= 90){
		System.out.println("A");
		}
		if(score >= 80){
			System.out.println("B");
			}
			if(score >=70){
				System.out.println("C");
				}
				if(score >=60)
					System.out.println("D");
					}
					if(score >=50){
						System.out.println("E");
					}
					else{
						System.out.println("Fail");
						}
		
	
	}
}
