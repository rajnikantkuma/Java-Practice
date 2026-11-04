import java.util.Scanner;

class LargestDigit
{
	public static void main(String[]args)
	{
	System.out.print("Enter number=");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();//  18325  12345 10001230
	int rem=0;int max=0;int min=0;
	for(;num!=0;num/=10)
		{
		rem=num%10;
		
		if(rem>max)
			{
			max=rem;
			}
		}
		if(max>min)
		{
		System.out.println(max+" is greater ="+max);
		}
		
	

		
	}
}