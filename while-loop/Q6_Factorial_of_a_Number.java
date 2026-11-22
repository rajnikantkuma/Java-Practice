import java.util.Scanner;
class Q6
{
	public static void main(String[]args)
	{
	System.out.print("Enter any number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();int i=1;int mul=1;
	while(num>=i)
		{
		mul=mul*num;
		num--;
		}
		System.out.println(mul);
	}
}