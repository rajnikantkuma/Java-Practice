import java.util.Scanner;
class Q8
{
	public static void main(String[]args)
	{
	System.out.print("Enter any number =");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int rem=0;
	int sum=0;
	while(num>0)
		{
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		}
		System.out.print(sum);
	
	}
}