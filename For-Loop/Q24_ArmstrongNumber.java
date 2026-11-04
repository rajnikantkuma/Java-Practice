import java.util.Scanner;

class ArmstrongNumber
{
	public static void main(String[]args)
	{
	System.out.print("Enter number=");
	Scanner sc=new Scanner(System.in);

	int num=sc.nextInt();//121
	int original=num;
	int copy=original;

	int sum=0;
	int rem=0;
	int ans=0;
	int result;
	for(;num!=0;num/=10)
		{
		sum=sum+1;
		}
		
		// System.out.println(sum);
		// System.out.println(original);
		// System.out.println("num=============="+num);


		for(;original!=0;original/=10)
			{
				rem=original%10;
				result=1;
				for(int i=1;i<=sum;i++)
					{
					result=result*rem;	
					}
				ans=ans+result;
			//System.out.println("ans========"+ans);	
			}
		if(ans==copy)
		{
			System.out.println("ArmstrongNumber");
		}
		else{
			System.out.println("Not ArmstrongNumber");
			}

		
	}
}