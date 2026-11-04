import java.util.Scanner;
class SumOfDigits
{
	public static void main(String[]args)
	{
		System.out.println("Enter a number =");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();//123
		int sum=0;int rem;
			for( ;num!=0;num=num/10)
				{
				rem=num%10;
				sum=sum+rem;
				}
				System.out.println(sum);
	}
}