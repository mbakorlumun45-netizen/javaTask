//inialize your variables and set both space and esterics to 1
//aesterics is from 10 to 1 in decreasing form
//space increase as aesterics decrease
//print space and aesterics
public class TrianTwo{
	public static void main(String[] args){

		for(int space = 10; space >= 1; space--){
			for(int aesterics = space; aesterics >= 1; aesterics--){
				System.out.print("*");
			}
			System.out.println("  ");
		}
	}
}
