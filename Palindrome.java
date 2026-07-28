import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Check if it is a palindrome, enter a word:");
	String word = scanner.nextLine();
	boolean checkIfPalindrome = palindrome(word);
	System.out.println(checkIfPalindrome);
	}
	
	//public static boolean palindrome(String word){
	//String reversedWord ="";
	//for(int count = word.length()-1; count>=0; count--){
		//reversedWord+=word.charAt(count);
	//}
	//if(reversedWord.equals(word)){
	//return true;
	//}else{
	//return false;
	//}
	
	//}
	
	public static boolean palindrome(String word){
	int stop = (word.length()-1)/2;
	for(int count =0; count<stop; count++){
	if(word.charAt(count) != word.charAt(word.length()-1-count)){
	return false;
	}
	} 
		return true;
	}
}
