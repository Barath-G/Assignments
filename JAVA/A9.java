import java.util.Scanner;
class A9
{ public static void main (String args[])
	{ int a,b,c,smallest,temp;
	Scanner sc = new Scanner (System.in);
	System.out.println ("Enter first number");
	a=sc.nextInt();
	System.out.println ("Enter second number");
	b=sc.nextInt ();
	System.out.println ("Enter third number");
	c=sc.nextInt();
	temp=a<b?a:b;
	smallest=temp<c?temp:c;
	System.out.println ("The largest number is" + smallest);
	}
}
	