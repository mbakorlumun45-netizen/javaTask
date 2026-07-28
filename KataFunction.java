public class KataFunction{
	public static boolean division(int number){
	
	
	if(number % 2 == 0){
		return true;
	}
	else{
		return false;
	}
	}
	public static void main(String[] args){
	
	boolean numResult = division(18);
	
	System.out.println(numResult);
	}
	

	public static boolean division(int number){
	
	if(number % 2 != 0){
		return true;
	}
	else{
		return false;
	}
	}
	public static void main(String[] args){
	
		boolean primeResult = division(20);
		
		System.out.println(primeResult);
	}
	

	public static int subtraction(int number1, int number2){
	
	int sub = number1 - number2;
	return sub;
	}
	
	public static void main(String[] args){
	
	int subResult = subtraction(7, 3);
	
	System.out.print(subResult);
	}
	

	public static double division(double number1, double number2){
	
	double div = number1 / number2;
	return div;
	}
	
	public static void main(String[] args){
	
	double divResult = division(8, 3);
	
	System.out.println(divResult);
	}
	

	public static int factors(int number){
	
	int box = 0;
	
	for(int count = 1; count <= number; count++){
		if(number % count == 0){
			box = box + 1;
		}
		}
		return box;
		}
		public static void main(String[] args){
		
		int boxResult = factors(100);
		
		System.out.print(boxResult);
		}
		
	
	public static boolean multiplication(int number){
	
	int multi = 0;
	int sum = 0;
	
	for(int count = 1; count < number; count--){
		if(number % count == 0){
		multi = multi + count;
		sum = sum + multi;
		return true;
		} 
		else{
			return false;
		}
		}
		}
		public static void main(String[] args){
		
		boolean multiResult = multiplication(7);
		
		System.out.println(sumResult);
		}
		
	
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

	int number = 54345;
	
System.out.println(("number:") + checkIfPali(number));
} 


	public static int multiplication(int number){
	
	int product = 1;
	int count = 1;
	
	while(count <= number){
		product = count * count;
		count++;
		}
		return product;
			}
		//public static void main(String[] args){
		
		int productResult = multiplication(25);
		
			System.out.println(productResult);
			}


	public static int multiplication(int number){
	
	int square = number * number;
	return square;
	
		}
		public static void main(String[] args){
		
		int squareResult = multiplication(5);
		
		System.out.println(squareResult);
		}
//}
