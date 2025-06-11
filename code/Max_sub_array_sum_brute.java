/*****************************************Max_sub_array_sum_brute********************/
import java.util.*;
public class Max_sub_array_sum_brute
{
    public static void max_sub_arr_sum(int arr[])
    {
        int current;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
           
            for(int j=i;j<arr.length;j++)
            {current = 0;
                for(int k=i;k<j;k++)
                {  current +=arr[k];
                    System.out.print(current+" ");
                    
                }
                if(max<current)
                {
                    max=current;
                }
            }
            System.out.println();
        }
        System.out.println("the max sub-array sum is : "+max);
    }
    public static void main (String args[])
    {
        int arr[]={1,-2,6,-1,3};
        max_sub_arr_sum(arr);
    }
}                        