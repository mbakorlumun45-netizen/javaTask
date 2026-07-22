public class MedPrime{
	public static int primeNumber(int number) {
		int sum = 0;
		
		for (int count = 2; count <= number;) {
			if (number % count == 0 ) {
				number = number / count;
				sum = sum + count;
				
			}
			
			else {
				count++;
			}
			
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(primeNumber(23));
	}

}
