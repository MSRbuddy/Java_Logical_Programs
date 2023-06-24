import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1=0,n2=1,n3,i,N;

        System.out.println("Enter the no.of terms in the Fibonacci Series : ");
        N = sc.nextInt();

        System.out.print("Fibonacci series : " + n1 + " " + n2);//printing 0 and 1

        for(i=2; i<N; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}