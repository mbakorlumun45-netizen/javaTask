public class Counter{
	public static void main(String[] args){

		for(int count = 1; count <= 10; count++){
			for(int space = 10; space >= count; space--){
				System.out.print(" ");
			}
			for(int counter = 1; counter <= count; counter++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
