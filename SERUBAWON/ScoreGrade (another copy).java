import java.util.Scanner;
public class ScoreGrade{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	System.out.print("Enter score");
	int score = input.nextInt();

	if(score >= 90 - 100){
	System.out.print("A");
	}
	if(score >= 80 - 89){
	System.out.print("B");
	}
	if(score >= 70 - 79){
	System.out.print("C");
	}
	if(score >= 60 - 69){
	System.out.print("D");
	}
	else{
	System.out.print("Fail");
   }
  }
 }
