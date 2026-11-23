import java.util.Scanner;
class Q7
{
	public static void main(String[]args)
	{
	System.out.print("Enter a number=");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int rem=0;
	int count=0;
	while(num>0)
		{
		rem=num%10;
		count=count+1;
		num=num/10;
		}
		System.out.println(count);
	}
}