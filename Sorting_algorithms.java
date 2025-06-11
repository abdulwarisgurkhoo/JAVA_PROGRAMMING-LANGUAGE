/******************************************Sorting_algorithms.java****************************/
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class Sorting_algorithms {
    public static void display(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void selection_sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length-1;j++)
            {
                    if(arr[min]>arr[j])
                    {
                        min=j;
                    }

            }
            int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=arr[min];
        }
    }
    public static void main (String args[])
    {
        int arr[]={3,4,5,2,3,5,7};
        int a=10;
     //  Arrays.sort(arr,0,6,Collections.reverseOrder());
     String str=null;
     try
     {

        System.out.print(str.length());
        System.out.println(a/0);
        System.out.println(arr[100]);
    }
     catch(ArithmeticException |ArrayIndexOutOfBoundsException | NullPointerException e)
     {
            System.out.print("yes u was correct"+"\n"+e);
     }finally{
        
     }
     System.out.println();
     display(arr);

     finally
     {

     }



    }
}
