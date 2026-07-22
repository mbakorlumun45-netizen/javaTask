public class MethodPerfect{
	public static boolean perfectNumbers(int number){
		
		int sum = 0;
		for (int count = 1; count <= number / 2; count++) {
			if (number % count == 0) {
				sum = sum + count;
			}
		}	
		
		if (sum == number) {
			return true;
		}
		
		return false;

	}
	
	public static void main(String[] args) {
		System.out.println(perfectNumbers(8));
	}
}
