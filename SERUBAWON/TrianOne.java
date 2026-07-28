//ten numbers to run from 1 to ten
//the invincible shape to print from 10 downward to zero
//the aesterics move from 1 to 10
//print the aaesterict and space
public class TrianOne{
	public static void main(String[] args){

		for(int space = 1; space <= 10; space++){
			for(int aesterics = 1; aesterics <= space; aesterics++){
				System.out.print("*");
			}
			System.out.println("  ");
		}
	}
}
