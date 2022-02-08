  import java.util.Scanner;
  
  public class SumProductMinMax {  // Save as "Add2Integers.java"
   public static void main (String[] args) {
   // Declare variables
      int number1, number2, number3;  // The 3 input integers
      int sum, product, min, max;     // To compute these
	  
      // Prompt and read inputs as "int"
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
      System.out.print("Enter first integer: ");  // No newline for prompting message
	  number1 = in.nextInt();                     // Read next input as "int"
      System.out.print("Enter second integer: ");  // No newline for prompting message
	  number2 = in.nextInt(); 
	  System.out.print("Enter third integer: ");  // No newline for prompting message
	  number3 = in.nextInt();	  
      in.close();  // Close Scanner
	  
      // Compute sum and product
      sum = number1+number2+number3;
      product = number1*number2*number3;
      // Compute min
      // The "coding pattern" for computing min is:
      // 1. Set min to the first item
      // 2. Compare current min with the second item and update min if second item is smaller
      // 3. Repeat for the next item
      min = number1;        // Assume min is the 1st item
      if (number2 < min) {  // Check if the 2nd item is smaller than current min
         min = number2;     // Update min if so
      }
      if (number3 < min) {  // Continue for the next item
         min = number3;
      }
	  else{
		  min = number1;
	  }
	  	 
	max = number1; 
	    if (number2 > max) {  // Check if the 2nd item is smaller than current min
         max = number2;     // Update min if so
      }
      if (number3 > max) {  // Continue for the next item
         max = number3;
      }
	  else{
		  max=number3;
	  }
	  
	  
    
	  System.out.println("The sum is: " + sum);   // Print with newline
	  System.out.println("The product is: " + product);   // Print with newline
	  System.out.println("The min is: " + min);   // Print with newline
	  System.out.println("The max is: " + max);   // Print with newline
   }

   }
   