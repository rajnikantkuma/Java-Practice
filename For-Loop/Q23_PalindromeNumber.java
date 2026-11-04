import java.util.Scanner;

class PalindromeNumber
{
	public static void main(String[]args)
	{
	System.out.print("Enter number=");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();//121
	int original=num;
	int rem=0;
	int result=0;

	for(;num!=0;num/=10)
		{
		rem=num%10;//4
		result=10*result+rem;
		}
		//System.out.println(result);
		if(result==original)
			{
			System.out.println("Palindrome");
			}
			else{
				System.out.println("Not Palindrome");
			}
	
	}
}