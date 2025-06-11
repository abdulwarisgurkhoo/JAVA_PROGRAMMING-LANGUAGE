/****************************Print_prime_range***********************/
import java.util.*;
public class Print_prime_range
{
    public static boolean isprime(int a)
    {
        if(a==2)
        {
            return true;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(a);i++)
            {
                if(a%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the no. upto which you want to print the prime numbers");
        int range=sc.nextInt();
        for(int i=2;i<=range;i++)
        {
            if(isprime(i))
            {
                System.out.print(i+" ");
            }
        }

    }
}
