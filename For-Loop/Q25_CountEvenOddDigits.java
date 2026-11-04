import java.util.Scanner;

class CountEvenOddDigits
{
	public static void main(String[]args)
	{
	System.out.print("Enter number=");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();//123456
	int rem=0;int Even=0;int Odd=0;
	for(;num!=0;num/=10)
		{
		rem=num%10;
			if(rem%2==0)
				{
				Even=Even+1;
				
				}
				else{
				Odd=Odd+1;
				
					}
						
				
		}
	System.out.println("Even="+Even);
	System.out.println("Odd="+Odd);
	

		
	}
}