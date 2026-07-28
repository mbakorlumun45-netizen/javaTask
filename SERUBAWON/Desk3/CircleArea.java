//declare radius to be 5.5(double)
//calculate the area = radius * radius * pi
//calculate the perimeter = 2 * radius * pi
//display the area and the perimeter

public class CircleArea{
	public static void main(String[] args) {
	
	double radius = 5.5;
	double pi = 3.142;
	
	double area = radius * radius * pi;
	double perimeter = radius * pi * 2;
	
	//x = ed - bf / ad - bc;
	//y = af - ec / ad - bc;
	
	System.out.printf("The area is: %f%n The perimeter is: %f%n", area, perimeter);

      }
  }
