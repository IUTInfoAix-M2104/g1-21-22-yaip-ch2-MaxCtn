  import java.util.Scanner;
  public class CircleComputation {  // Save as "Add2Integers.java"
   public static void main (String[] args) {

	 // Declare variables
      double radius, diameter, circumference, area;  // inputs and results - all in double
	  Scanner in = new Scanner(System.in);  // Scan the keyboard for input

      // Prompt and read inputs as "double"
      System.out.print("Enter the radius: ");
      radius = in.nextDouble();  // read input as double

      // Compute in "double"
	  diameter = 2.0 * radius;
	  area = Math.PI * radius * radius;
	  circumference = 2.0 * Math.PI * radius;

      // Print results using printf() with the following format specifiers:
      //   %.2f for a double with 2 decimal digits
      //   %n for a newline
      System.out.printf("Diameter is: %.2f%n", diameter);
      System.out.printf("area is: %.2f%n", area);
	  System.out.printf("circumferenceis: %.2f%n", circumference);
   }
  }