import java.util.Scanner;

class RepeatedDigits
{
    public static void main(String[] args)
    {
        System.out.print("Enter number = ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int store = 0;
        int count = 0;
        int rem = 0;

        for(; num != 0; num /= 10)
        {
            rem = num % 10;

            if(store != rem)
            {
                if(count > 1)
                {
                    System.out.println(store + " occurs " + count + " times");
                }

                store = rem;
                count = 1;
            }
            else
            {
                count = count + 1;
            }
        }

        if(count > 1)
        {
            System.out.println(store + " occurs " + count + " times");
        }

        
    }
}