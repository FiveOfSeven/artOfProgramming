import java.util.Scanner; //import the Scanner object

/* This is a simple Java program. 
   FileName : "HelloWorld.java". */
class HelloWorld 
{ 
    // Your program begins with a call to main(). 
    // Prints "Hello, World" to the terminal window. 
    public static void main(String args[]) { 
        System.out.println("Euclids algorithm. Finds the greatest common divisor"); 
        System.out.println("m: first number, n: second number, r: remainder"); 
        System.out.println("give the first number (m)"); 
		ui myUi = new ui();
		int m = myUi.getNumber();
        System.out.println("give the second number (n)"); 
		int n = myUi.getNumber();
		euc myEuc = new euc();
		int gcd = myEuc.gcd(m, n);
		System.out.println("m: " + m); // output user input
		System.out.println("n: " + n); // output user input
        System.out.println("gcd: " + gcd); 
 	}
}
