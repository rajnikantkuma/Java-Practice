import java.util.Scanner;
class Q4
{
	public static void main(String[]args)
	{
	System.out.print("Enter multiplication table=");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int i=1;
	while(10>=i)
		{
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}
	}
}