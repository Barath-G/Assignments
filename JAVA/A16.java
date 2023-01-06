/*Write a java program to print numbers between 1 to 100 which are divisible by
3; 5 and by both */
class A16
{
	public static void main(String[] args){
		for (int i =1;i<=100;i = i+1){
			if (i % 3 == 0){
				if (i % 5 == 0){
					System.out.print(i +" ");
				}
			}
		
		}
	}
	
}