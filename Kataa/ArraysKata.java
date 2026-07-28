public class ArraysKata{
	//public static int FindLargestArrays(int[] numbers){
	
	//int largestNumber = numbers[0];
	
	//for(int count = 0; count < numbers.length; count++){
		//if(numbers[count] > largestNumber){
			//largestNumber = numbers[count];
		//}
	//}
	//return largestNumber;
	//}
	//public static void main(String[] args){
	
		//int[] largestNumber = {8, 78, 23, 13, 90, 87, 45, 37};
		
		//int result = FindLargestArrays(largestNumber); 
	
		//System.out.println(result);
	//}
	
	
		//public static int FindSmallestArrays(int[] numbers){
		
		//int smallestNumber = numbers[0];
		
		//for(int count = 0; count < numbers.length; count++){
			//if(numbers[count] < smallestNumber){
				//smallestNumber = numbers[count];
			//}
		//}
		//return smallestNumber;
		//}
		
		//public static void main(String[] args){
		
			//int[] smallestNumber = {12, 56, 89, 90, 34, 23, 11, 10};
			
			//int result = FindSmallestArrays(smallestNumber);
			
			//System.out.println(result);
		//}
		//public static int sumOfArrays(int[] numbers){
		
		//int sum = 0;
		
		//for(int count = 0; count < numbers.length; count++){
	
				//sum = sum + numbers[count];
			//}
			//return sum;
		//}
		//public static void main(String[] args){
			
			//int[] numbers = {89, 90, 45, 67, 23, 12, 25};
			
			//int result = sumOfArrays(numbers);
			
			//System.out.print(result);
		//}
		
		//public static int sumOfEvenNumbers(int[] numbers){
			
			//int sumEven = 0;
			
			//for(int count = 0; count < numbers.length; count++){
				//if(numbers[count] % 2 == 0){
					//sumEven += numbers[count];
					
				//}
				//}
				//return sumEven;			
				//} 
				
				//public static void main(String[] args){
				
					//int[] sumEven = {12, 45, 15, 78, 90, 95, 34, 10, 11, 4, 8, 21, 20, 32};
					
					//int result = sumOfEvenNumbers(sumEven);
					
					//System.out.println(result);
				//}
				
			
		//public static int sumOfOddNumbers(int[] numbers){
		
			//int sumOdd = 0;
			
			//for(int count = 0; count < numbers.length; count++){
				//if(numbers[count] % 2 != 0){
				
				//sumOdd += numbers[count];
				//}
				//}
				//return sumOdd;
				//}
				
				//public static void main(String[] args){
				
				//int[] sumOdd = {23, 12, 34, 45, 78, 89, 93, 23, 45, 32, 20, 27, 90, 91};
				
				//int result = sumOfOddNumbers(sumOdd);
				
				//System.out.println(result);
			
				//}
				
		//public static int numberOfOddNumbers(int[] numbers){
		
		//int oddNumbers = 0;
		
		//for(int count = 0; count < numbers.length; count++){
			//if(numbers[count] % 2 != 0){
				//oddNumbers = oddNumbers + 1;
			//}
			//}
			//return oddNumbers;
			//}
			
			//public static void main(String[] args){
			
			//int[] oddNumbers = {13, 12, 23, 56, 22, 56, 34, 33, 45, 67, 91, 89, 100, 101, 103, 99};
			
			//int result = numberOfOddNumbers(oddNumbers);
			
			//System.out.println(result);			
			//}
			
		//public static int numberOfEvenNumbers(int[] numbers){
		
		//int evenNumbers = 0;
		
		//for(int count = 0; count < numbers.length; count++){
			//if(numbers[count] % 2 ==0){
				//evenNumbers = evenNumbers + 1;
			//}
			//}
			//return evenNumbers;
			//}
			
			//public static void main(String[] args){
			
			//int[] evenNumbers = {13, 12, 15, 17, 18, 27, 22, 24, 34, 38, 44, 20, 23, 64};
			
			//int result = numberOfEvenNumbers(evenNumbers);
			
			//System.out.println(result);
			//}

		//public static int[] arraysOfOddNumbers(int[] numbers){
		
			//int[] listOdd = new int[numbers.length];
			//int odd = 0;
			
			//for(int count = 0; count < numbers.length; count++){
				
				//if(numbers[count] % 2 != 0){
					//listOdd[odd++] = numbers[count];
				//}	
				//}
				//return listOdd;
				//}
				
				//public static void main(String[] args){
				
				//int[] listOdd = {12, 23, 33, 42, 13, 34, 15, 26, 28, 14, 55, 38, 58, 54};
				
				//int[] result = arraysOfOddNumbers(listOdd);
			//for(int count = 0; count < result.length; count++){
				//System.out.println(result[count]);
				//}
				//}
				
			//public static int[] arraysOfEvenNumbers(int[] numbers){
			
			//int[] listEven = new int[numbers.length];
			//int even = 0;
			
			//for(int count = 0; count < numbers.length; count++){
				//if(numbers[count] % 2 == 0){
					//listEven[even++] = numbers[count];
					
				
				//}
				//}
				//return listEven;
				//}
				
				//public static void main(String[] args){
				
				//int[] listEven = {23, 34, 12, 24, 26, 34, 21, 33, 45, 56, 74, 88, 22, 36, 35, 43};
				
				//int[] result = arraysOfEvenNumbers(listEven);
				
				//for(int count = 0; count < numbers.length; count++){
					//System.out.println(result[count]);				
				//}
				//}
				
			//public static int[] squareOfNumbers(int[] numbers){
			
			//int[] square = new int[numbers.length];
			
			//int count = 0;
			
			//while(count < numbers.length){
				//square[count] = numbers[count] * numbers[count];
				//count++;	 
			//}
			//return square;
			//}
			
			//public static void main(String[] args){
			
			//int [] square = {5, 10, 25, 3, 9};
			
			//int[] result = squareOfNumbers(square);
			
			//for(int count = 0; count < result.length; count++){
			//System.out.println(result[count]);
			//}
			//}	
			
		public static int[] FindMaxAndMinNumbers(int[] numbers){
		
			int max = numbers[0];
			int min = numbers[0];
			
			for(int count = 0; count < numbers.length; count++){
			
				if(numbers[count] > max){
				
					max = numbers[count];
				
				}
				if(numbers[count] < min){
					min = numbers[count];	
				}
				
				}
				return new int[] {max, min};
				}
				
				public static void main(String[] args){
				
				int[] max = {12, 24, 78, 34, 31, 56, 90, 54, 42,51, 65,63,32};
				
				int[] mix = {12, 24, 78, 34, 31, 56, 90, 54, 42,51, 65,63,32};
				
				int[] result1 = FindMaxAndMinNumbers(max);
				
				int[] result2 = FindMaxAndMinNumbers(mix);
				
				 System.out.println("maximum, " + result1[0]); 
				 
				 System.out.println("minimum, " + result2[1]); 
				}
	}
																		

