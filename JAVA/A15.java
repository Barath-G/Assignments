/*A14 What Is an enhancement for Loop?
for(declaration : expression) {
   // Statements
}
*/
/*A15. Write a Java program to print first 5 values which are divisible by 2; 3 and 5*/
//Using While Loop//

/*class A15
{	static void divisible (int N)
	{ int num = 1;
		while (num < N)
		{ if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0)
			System.out.print ("");
			num++;
		}
	}
	public static void main (String args[])
	{ int N = 100;
		divisible (N);
	}
}*/
// Java program to find if a number
// is divisible by 5 or not

// importing Classes/Files
import java.util.*;

class A15 {

	// Main Driver function
	public static void main(String[] args)
	{
		// Taking any random number to test
		int n = 464565625;

		// Checking if remainder is 0 or not
		// when divided by 5
		if (n % 5 == 0)

			// Print yes if no is divisible by 5
			System.out.println("Yes");
		else

			// Print no if no is not divisible by 5
			System.out.println("No");
	}
}

