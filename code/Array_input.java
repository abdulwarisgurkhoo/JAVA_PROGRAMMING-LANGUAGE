/************************to implement arrays in java take inputs and show on console*********************/
import java.util.*;
public class Array_input
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch='A';
        System.out.println(Character.SIZE);
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
        {
             arr[i]=sc.nextInt();

        }
            for(int i=0;i<10;i++)
            {
                System.out.print(arr[i]+"  ");
            }

    }
}
