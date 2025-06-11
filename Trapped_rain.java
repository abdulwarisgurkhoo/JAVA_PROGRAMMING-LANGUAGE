/***********************************Trapped_rain.java******************************************/
import java.util.*;
public class  Trapped_rain {
    public static void total_water(int arr[])
    {
        int n=arr.length;
        int left_bound[]=new int[n];
        int right_bound[]=new int[n];
        left_bound[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            left_bound[i]=Math.max(arr[i],left_bound[i-1]);

        }
        right_bound[n-1]=arr[n-1];


        for(int i=n-2;i>=0;i-- )
        {
            right_bound[i]=Math.max(arr[i],right_bound[i+1]);

        }
        int trapped=0;
        for(int i=0;i<n;i++)
        {
            trapped +=Math.min(left_bound[i],right_bound[i])-arr[i];
        }
        System.out.println("the total trapped water is : "+trapped);
    }
    public static void main (String args[])
    {
       int heights[]={4,2,0,6,3,2,5};   
       total_water(heights);
    }
   

}
