import java.util.Scanner;
class PowerOfNumber
{
	public static void main(String[]args)
	{
		System.out.print("Enter base=");
	
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		System.out.print("Enter power=");
		int power=sc.nextInt();
		int mul=1;
		for(int i=1;i<=power;i++)
			{
				mul=mul*base;
			}
			System.out.println("Result of "+base+"^"+power+"="+mul);
	}
}