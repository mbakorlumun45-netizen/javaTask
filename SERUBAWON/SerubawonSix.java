//import scanner
//collect input of the two numbers
//compute their sum, differnce, product and quotient
//print them out accordingly
import java.util.Scanner;
public class SerubawonSix{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first number");
int number1 = input.nextInt();

System.out.print("Enter second numer");
int number2 = input.nextInt();

int sum = 0;
int difference = 0;
int product = 0;
int quotient = 0;

sum = number1 + number2;
difference = number1 - number2;
product = number1 * number2;
quotient = number1 / number2;

System.out.println("The sum is: " +sum);
System.out.println("The difference is: " +difference);
System.out.println("The product is: " +product);
System.out.println("The quotient is: " +quotient);
}

}
