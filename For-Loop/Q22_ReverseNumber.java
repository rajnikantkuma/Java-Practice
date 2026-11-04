import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[]args)
	{
	System.out.println("Enter number=");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();//1234  4321
	int rem=0;
	int store=0;

	for(;num!=0;num/=10)
		{
		rem=num%10;//4
		store=10*store+rem;
		}
		System.out.println(store);
	
	}
}