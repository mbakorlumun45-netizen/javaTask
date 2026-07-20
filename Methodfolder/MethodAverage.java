public class MethodAverage{
	public static int average(int a, int b, int c){
	
	int avesum = a + b + c;
	int ave = avesum / 3;
	return ave;
	}
	
	public static void main(String[] args){
		int aveResult = average(43, 60, 35);
		
		System.out.print(aveResult);
	}
}
