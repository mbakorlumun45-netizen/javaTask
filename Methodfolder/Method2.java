public class Method2{
	public static int divide(int a, int b){
	
	int div = a / b;
	return div;
	}
	
	public static int multiply(int a, int b){
	int mult = a * b;
	return mult;
	}
	
	public static void main(String[] args){
		int divResult = divide(10, 5);
		
		int multResult = multiply(12, 7);
		
		System.out.println(divResult);
		
		System.out.println(multResult);
	}
}
