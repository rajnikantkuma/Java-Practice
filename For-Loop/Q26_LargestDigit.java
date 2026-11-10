import java.util.Scanner;

class LargestDigit
{
	public static void main(String[]args)
	{
	System.out.print("Enter number=");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int rem=0;int max=0;
	for(;num!=0;num/=10)
		{
		rem=num%10;
		
		if(max<rem)
			{
			max=rem;
			}
		}
		System.out.println("Maximum number is ="+max);
		
	}
}