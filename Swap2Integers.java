 import java.util.Scanner;
  public class Swap2Integers {  // Save as "Add2Integers.java"
   public static void main (String[] args) {
	   Scanner in = new Scanner(System.in);  // Scan the keyboard for input
	   double number1;
	   double number2; 
	   double x = 0;
	   double y = 0;
	   
	  System.out.print("Enter the number 1: ");
      number1 = in.nextDouble();  // read input as double
	  System.out.print("Enter the number 2: ");
      number2 = in.nextDouble();  // read input as double
	  in.close();
	  
	   x = number1;
	   number1 = number2;

	   number2 = x;
	   
	   System.out.printf(" number1 = "+ number1);
	   System.out.printf(" number2 = ", number2);
   }
  }