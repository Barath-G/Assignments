import java.util.*;
class A7
{
	public static void main (String args[])
	{ int num1, num2;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter two numbers");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
		if (num1 < num2)
		{
			System.out.println (num1 + " is Lesser ");
		}
		else if (num2 < num1)
		{
		System.out.println (num2 + "Lesser is");
	}
	}
}