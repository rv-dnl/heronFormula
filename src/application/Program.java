package application;
import java.util.Scanner;
import entities.Triangle;

public class Program {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	Triangle x, y;
	
	x = new Triangle();
	y = new Triangle();
	
	System.out.println("Enter the measures of triangle X");
	
	System.out.printf("%nA: ");
	x.a = sc.nextDouble();
	System.out.printf("B: ");
	x.b = sc.nextDouble();
	System.out.printf("C: ");
	x.c = sc.nextDouble();
	
	System.out.printf("%nEnter the measures of triangle Y%n");
	
	System.out.printf("%nA: ");
	y.a = sc.nextDouble();
	System.out.printf("B: ");
	y.b = sc.nextDouble();
	System.out.printf("C: ");
	y.c = sc.nextDouble();
	
	
	double areaX = x.area();
	double areaY = y.area();
	
	System.out.printf("%nTriangle X area: %.4f%n", areaX);
	System.out.printf("Triangle Y area: %.4f%n", areaY);
	
		if (areaX > areaY) {
			System.out.printf("%n<<Larger area: X>>");
		}
		else {
			System.out.printf("%n<<Larger area: Y>>");
		}
		
		sc.close();
}
}