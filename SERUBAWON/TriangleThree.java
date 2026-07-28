 // space is first in the picture to be considered first
 //space is in creasing form which is 1 is less than 10
 //The aesterics will start from 10 downward which is decreament by 1 
 //the print of empty space and an aesterics
 public class TriangleThree{
	public static void main(String[] args){

		for(int space = 1; space <= 10; space++){
			for(int aesterics = 1; aesterics <= space; aesterics++){
				System.out.print(" ");
			}
			for(int aesterics = 10; aesterics >= space; aesterics--){
				System.out.print("*");
			}
					System.out.println();
		}
		
	}
}
