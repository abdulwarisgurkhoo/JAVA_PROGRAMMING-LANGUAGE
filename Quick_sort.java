/********************implementing quick sort algorithm*********************/
import java.util.*;
public class Quick_sort
{
    public static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int partitioning(int arr[],int start,int end)
    {
        int pos =start;
        int pivot=arr[end];
        for(int i=0;i<=end;i++)
        {
            if(arr[i]<=pivot)
            {
                int temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
                pos++;
            }
            
        }
        return pos-1;
    }
    public static void sorting(int arr[],int p,int q)
    {
        if(p>=q)
        {
            return ;
        }
        int pivot=partitioning(arr, p, q);
        sorting(arr,p,pivot-1);
        sorting(arr,pivot+1,q);
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,7,10,9};
        sorting(arr,0,5);
        display(arr);
    }
}