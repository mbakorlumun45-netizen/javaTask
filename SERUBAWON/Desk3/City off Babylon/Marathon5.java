import java.util.Scanner;
public class Marathon5{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number");
	int number1 = input.nextInt();
	
	System.out.print("Enter second number");
	int number2 = input.nextInt();
	
	System.out.print("Enter third number");
	int number3 = input.nextInt();
	
	System.out.print("Enter fourth number");
	int number4 = input.nextInt();
	
	System.out.print("Enter fiveth number");
	int number5 = input.nextInt();
	
	System.out.print("Enter sixth number");
	int number6 = input.nextInt();
	
	int sum = number1 + number2 + number3 + number4 + number5 + number6;
	
	System.out.print("sum of 6 numbers" +sum);
	
	if(number1 > number2){
          System.out.print("number1 is the largest");        	  
	  }
	  
	  else if(number2 > number3){
              System.out.print("number2 is the largest");
	    }
	    
	    else if(number3 > number4){
	      System.out.print("number3 is the largest");
	      }
	      
	   else if(number4 > number5){
	    System.out.print("number4 is the largest");
	    }
	    
	    else if(number5 > number6){
	    System.out.print("number4 is the largest");
	    }
	    
	    else if(number6 > number1){
	    System.out.print("number4 is the largest");
	    }
	    
	    
	    else if(number1> number2){
	    System.out.print("number4 is the largest");
	    }
	    
	    if(number2 < number3){
          System.out.print("number1 is the smallest");        	  
	  }
	  
	  else if(number3 < number4){
              System.out.print("number2 is the smallest");
	    }
	    
	    else if(number4 < number5){
	      System.out.print("number3 is the smallest");
	      }
	      
	      else if(number5 > number6){
	    System.out.print("number4 is the largest");
	    }
	    
	    else if(number6 > number1){
	    System.out.print("number4 is the largest");
	    }
	
	} 
}
