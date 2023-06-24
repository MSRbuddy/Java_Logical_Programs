import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (isPrime(n))
        {
            System.out.println(n + " is a prime number");
        }
        else
        {
            System.out.println(n + " is not a prime number");
        }
    }

    public static boolean isPrime(int n)
    {
        int m = n/2;
        if (n <= 1)
        {
            return false;
        }
        for (int i = 2; i < m; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
