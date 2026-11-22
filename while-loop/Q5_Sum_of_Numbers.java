import java.util.Scanner;
class Q5
{
	public static void main(String[]args)
	{
	System.out.print("Enter any number=");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum=0;
	int i=1;
	
	while(i<=num)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}
}