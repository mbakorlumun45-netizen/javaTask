import java.util.Scanner;
public class Marathon3{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number");
	int number1 = input.nextInt();
	
	System.out.println("Enter second number");
	int number2 = input.nextInt();
	
	System.out.println("Enter third number");
	int number3 = input.nextInt();
	
	System.out.println("Enter fourth number");
	int number4 = input.nextInt();
	
	int sum = number1 + number2 + number3 + number4;
	
	System.out.println("sum of four numbers" + sum);
	
	double average = sum / 4;
	
	System.out.println("average of sum" + average);
	
	int product = number1 * number2 * number3 * number4;
	
	System.out.println("product of four numbers" +product);
	
	if(number1 > number2){
          System.out.print("number1 is the largest");        	  
	  }
	  
	  else if(number2 > number3){
              System.out.print("number2 is the largest");
	    }
	    
	    else if(number3 > number4){
	      System.out.print("number3 is the largest");
	      }
	      
	   else if(number4 > number1){
	    System.out.print("number4 is the largest");
	    }
	    
	    if(number1 < number2){
          System.out.print("number1 is the smallest");        	  
	  }
	  
	  else if(number2 < number3){
              System.out.print("number2 is the smallest");
	    }
	    
	    else if(number3 < number4){
	      System.out.print("number3 is the smallest");
	      }
	      
	   else if(number4 < number1){
	    System.out.print("number4 is the smallest");
	    }
	    
	    
	  
	}
	
}
	   
       
	  
	  
	
	

