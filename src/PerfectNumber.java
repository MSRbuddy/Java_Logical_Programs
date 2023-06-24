import java.util.Scanner;

public class PerfectNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number to check it's a Perfect number or not : ");
        int perfectnumber = sc.nextInt();

        int sumofdivisiors = 0;
        for (int i=1; i <=perfectnumber/2; i++)
        {
            if(perfectnumber % i == 0)
            {
                sumofdivisiors = sumofdivisiors + i;

            }
        }
        if(sumofdivisiors == perfectnumber)
        {
            System.out.println(perfectnumber + " is a perfect number");
        }
        else
        {
            System.out.println(perfectnumber + " is not a perfect number");
        }
    }
}