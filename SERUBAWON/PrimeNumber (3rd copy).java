public class PrimeNumber{
	public static void main(String[] args){
	
	int primeNumbers = 0;
	for(int counter = 1; counter <= 1000; counter++){
		for(int count = counter; count <= counter; count++){
			if(primeNumbers % count != 2){
				count = primeNumbers;
			
			primeNumbers = count + 2;
				count = primeNumbers;				
			System.out.print(count);
			
			}
		}
	}
	}
}
