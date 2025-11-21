public class Activity81{ 
    /** Main method */ 
    public static void main(String[] args) { 
	int a = 5; 
	int b = 2; 
	int c = max(a, b); //Method calling 
	System.out.println("The maximum of " + a + " and " + b + " is " + c); 
    } 
    /** Return the max of two numbers – Method Definition*/ 
    public static int max(int num1, int num2) { 
	int result; 
	if (num1 > num2) 
	result = num1; 
	else 
	result = num2; 
	return result; // returning the value 
	} 
     } 
