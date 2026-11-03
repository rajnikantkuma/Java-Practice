import java.util.Scanner;
class MultiplicationTableOfAnyNumber
{
	public static void main(String[]args)
	{
	System.out.print("Enter any number=");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
		
			for(int i=1;i<=10;i++)
				{
				System.out.println(n+"*"+i+"="+n*i);
				}
		}
}