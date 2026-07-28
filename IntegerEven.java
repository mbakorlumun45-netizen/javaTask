public class IntegerEven{
	public static boolean division(int number){
	
	
	if(number % 2 == 0){
		return true;
	}
	else{
		return false;
	}
	}
	public static void main(String[] args){
	
	boolean numResult = division(19);
	
	System.out.println(numResult);
	}
}
