//import scanner to collect input
//collect input from the user
//display options for the user
//first display student names for option
//secondly, display an option to enter grade
//create  default for when a user enters a wrong grade
//create a variable that will calculate the number of students that have a particular grade
//
import java.util.Scanner;
public class StudentGrade{
	public static void main(String[] args){
	
	int inputCollector = new Scanner(System.in);
	
	int studentNameoption;
	studentNameoption = inputCollector();
	case 1: System.out.print("student name");
		switch (studentNameoption){
	 String studentName = """
	 1 orban
	 2 kvng
	 3 mathias
	 4 lumun
	 5 mbakor
	 	""";
	 	
	 	
	 	int studentNamechoice;
	 	System.out.print("studentname selection");
	 	studentNamechoice = inputCollector();
	 		switch(studentNamechoice){
	 		case 1  : System.out.println("orban"); break;
	 		case 2  : System.out.println("kvng"); break;
	 		case 3  : System.out.println("mathias"); break;
	 		case 4  : System.out.println("lumun"); break;
	 		case 5  : System.out.println("mbakor"); break;
	 		default : System.out.println("Invalid input");
			} 
	 		}
	 	
	 	
	}

}

