import java.util.Scanner;
public class SentinelOne{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int total = 0;
	int gradecounter = 0;
	int average = 0;
	
	System.out.print("Enter grade or -1 to quit");
	int grade = input.nextInt();
	
	for(int counter = 0; counter != -1; counter++ ){
		System.out.print("Enter grade or -1 to quit");
		grade = input.nextInt();
		
		total = total + grade;
		//counter = counter + 1;
		
		if(grade == -1){
			average = total / counter;
			System.out.printf("The average is: %d ", average);
		}
		
	}
	}
}
