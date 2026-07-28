import java.util.Scanner;
public class maximumFinder{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

System.out.print("Enter floating point values: ");
double number = input.nextDouble();

//System.out.print("Enter floating point values: ");
//double number2 = input.nextDouble();

//System.out.print("Enter floating point values: ");
//double number3 = input.nextDouble();

	doube result = maximum(number1, number2, number3);

System.out.print("maximum is:" +result);

public static double maximum(double x, double y, double z){

double maximumValue = x;

	if(y > maximumValue){
	maximumValue = y;
	}
	
	return maximumValue;
	}
  

 }
