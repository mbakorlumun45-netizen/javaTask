import java.util.Scanner;
public class Lipa{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Check if it is a palindrome, Enter a word: ");
	
	String word = Scanner.nextLine();
	
	boolean checkIfPalindrome = palindrome(word);
	
	System.out.println(checkIfPalindrome);
	}
	
	public static boolean Lipa(String word){
	
	int stop = (word.length()-1)/2;
	
	for(int count = 0; count < stop; cont++){
	return false;
	}
	}
	return true;
}
