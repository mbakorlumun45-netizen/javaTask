import java.util.Scanner;
public class Lupa{
public static boolean checkIfPali(int number){

int numberOne = number % 10;

int numbersTwo = number / 10;
int numberTwo = numbersTwo % 10;
int numbersThree = number / 100;
int numberThree = numbersThree % 10;
int numbersFour  = number / 1000;
int numberFour = numbersFour % 10;
int numbersFive = number / 10000;
int numberFive = numbersFive % 10;

if(numberOne == numberFive && numberTwo == numberFour){
	return true;
	
	}
	return false;
}

public static void main(String[] args){
//Scanner input = new Scanner(System.in);
//boolean 
	int number = 54345;
System.out.println(("number:") + checkIfPali(number));
} 
}
