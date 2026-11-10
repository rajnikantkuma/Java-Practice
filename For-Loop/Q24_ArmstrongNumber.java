import java.util.Scanner;

class ArmstrongNumber
{
	public static void main(String[]args)
	{
	System.out.print("Enter number=");
	Scanner sc=new Scanner(System.in);

	int n=sc.nextInt();//121
	int count=0;
		int num2=n;int original=n;
		for(;n!=0;n/=10)
		{
			count=count+1;
			
		}
			System.out.println(count);
//			System.out.println("ye n wala hai ="+n);
//			System.out.println("num2="+num2);
			int add=0;
				
			for(;num2!=0;num2/=10)
			{
				
				int rem=num2%10;
				int mul=1;
				System.out.println("mul="+mul);
				for(int j=1;j<=count;j++)
				{

					mul=mul*rem;
					
				}
				
				add=add+mul;
				
			}
			System.out.println("Add="+add);
			System.out.println("original="+original);

			if(add==original)
			{
				System.out.println("Armstrong number");
			}
			else {
				System.out.println("Not a Armstrong number");

			}
		
	}
}