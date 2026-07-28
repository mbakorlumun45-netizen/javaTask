public class PrimePrimePrime{
	public static int factorization(int number){
	
	int prime = 0;
	
	for(int count = 2; count <= number;){
		if(number % count == 0){
			number = number / count;
			prime = prime + count;
		}
		else{
			count++;
		}
		}
		return prime;
	}
	public static void main(String[] args){
	
	int primeResult = factorization(50);
	System.out.println(primeResult);
	}
}
