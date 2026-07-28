import java.util.Arrays;
public class ArraysNightClass{
	public static void main Arrays{
	
	//1. storage 2. organization 3. repetition
	
	int[] scores = {23, 45, 67, 89, 90, 42, 12, 56, 78,89};
	int sum = 0;
	int averageOfNumbers = 0;
	
	//dynamic list//
	//ArraysList<Integer>scores = new ArrayList<>();
	
	int largest = scores[0];
	for(count = 0; count < scores.length; count++){
		if(scores[count] > largest){
			largest = scores[count];
			
			sum += scores[count];
			
			double average = (double) sum / scores.length;
		}
		
	}
	System.out.println(largest);
	System.out.println(sum);
	System.out.println(average);
	}
}
