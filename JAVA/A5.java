class A5
{	
	public static void main (String args[])
	{ 
	int a[]={2,6,8,9,3,11};
	System.out.println ("Even Numbers");
	for (int i=0;i<a.length;i++)
	if (a[i]%2==0){
	System.out.println(a[i]);
	}
	System.out.println ("Odd Numbers");
	for(int i=0;i<=a.length-1;i++){
		if(a[i]%2 != 0){
			System.out.println(a[i]);
		}
	}
	}
}