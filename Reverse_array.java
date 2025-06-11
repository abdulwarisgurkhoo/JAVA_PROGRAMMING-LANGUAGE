import java.util.*;
public class Reverse_array
{
    public static void sub_array(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<j;k++)
                {
                    System.out.print(arr[k]);
                }
                System.out.print(" ");
            }
           System.out.println();


        }
     }
    public static void reverse(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        
        while(i<=j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
      
    }
    public static void inputs_array(int arr[])
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("PLEASE ENTER THE INPUTS OF ARRAYS");
        for(int i =0;i <arr.length;i++)
        {
            System.out.println("enter the element no. "+i+" : ");
            arr[i]=sc.nextInt();
        }
    }
    public static void display(int arr[])
    {
        System.out.println("your arrays is ") ;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse_using_new(int arr[])
    {
        int arr2[]=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            arr2[i]=arr[j];
            j++;
        }
        System.out.println("\nyour array after reverse is \n");
        display(arr2);
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        inputs_array(arr);
       // display(arr);
        sub_array(arr);

        
      
        


    }
}
