//import scanner
//collect input
//compute price, tax and total according to their significance
//print out total
import java.util.Scanner;
pulic class SerubawonSeven{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter read price");
int price = input,nextInt();

System.out.print("Enter calculated tax");
int tax = input,nextInt();

System.out.print("Enter calculated total");
int total = input,nextInt();

tax = price * 0.075;
total = price / tax;

ystem.out.print("The total is: " +total);
}

}
