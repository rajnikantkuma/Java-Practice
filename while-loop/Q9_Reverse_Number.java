import java.util.Scanner;
class Q9
{
	public static void main(String[]args)
	{
	System.out.print("Enter a number=");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int original=num;
	int rem=0;
	int store=0;
	
	while(num>0)
		{
		rem=num%10;
		store=store*10+rem;
		num=num/10;
		}
		System.out.println("original number is ="+original);
		System.out.println(store);
	}
}