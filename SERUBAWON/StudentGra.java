import java.util.Scanner;
public class StudentGra{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("Enter name of student");
	String name = input.nextLine();
	
	//System.out.print("Enter student remark");
	//String remark = input.nextLine();
	
	System.out.print("Enter number of student");
	int number0fstudent = input.nextInt();
	
	System.out.print("Grade of student");
	int grade = input.nextInt();
	
	int studentgradechoice;
	int totalgrade = grade * grade;
	
	switch (studentgradechoice){
	case A System.out.print("Excellent"); break;
	case B System.out.print("very good"); break;
	case C System.out.print("good"); break;
	case D System.out.print("pass"); break;
	case E System.out.print("fail"); break;
	default : System.out.print("Invalid input");
	}
	for(int counter = 1; counter <= 5; counter++){
		grade = counter;
		counter = grade;
	}
	System.out.printf("%d ", totalgrade);
	
	}
	}
