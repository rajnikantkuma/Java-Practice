import java.util.Scanner;
class FactorialNumber
{
	public static void main(String[]args)
	{
	System.out.print("Enter a number =");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int mul=1;
		for(int i=n;i>=1;i--)
		{
			mul=mul*i;
		}
		System.out.println("Factorial= "+mul);
	}
}