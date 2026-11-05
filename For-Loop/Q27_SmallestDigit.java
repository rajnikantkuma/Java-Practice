import java.util.Scanner;

class SmallestDigit
{
    public static void main(String[] args)
    {
        System.out.print("Enter number = ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


        int rem;
        int min = num % 10;  //58329    9

        for (; num != 0; num /= 10)
        {
            rem = num % 10;

            if (rem < min)
            {
                min = rem;
            }
        }

        System.out.println("Smallest digit = " + min);
    }
}