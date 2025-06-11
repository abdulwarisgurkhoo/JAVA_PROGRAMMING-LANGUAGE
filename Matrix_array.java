/**********************************2-D ARRAY IMPLEMENTATION***********************/
import java.util.*;
public class Matrix_array
{
    public static void display(int arr[][])
     { System.out.println("\nthe matrix you made is \n");

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }
     }
      public static void set_inputs(int arr[][])
    {
        int a=1;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.println("enter element no. "+a);
                arr[i][j]=sc.nextInt();
                a++;
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        int arr[][]=new int [3][5];
       set_inputs(arr);
       display(arr);

    }
}
