import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int N = sc.nextInt();
        int reversed = 0;

        while(N != 0)
        {
            int rem = N % 10;
            reversed = reversed * 10 + rem;
            N = N/10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
