/*******************************implementation of 2d arrays***************************/
import java.util.*;
public class Array_2D
{
       
        public static void display(int arr[][])
        {
                System.out.println("the array you entered is :--> ");
                for(int i=0;i<arr.length;i++)
                {
                        for(int j=0;j<arr[0].length;j++)
                        {
                                System.out.print(arr[i][j]+" ");
                       }
                       System.out.println();
                }
        }
        public static void main(String args[])
        {
                int a=1;
                Scanner sc = new Scanner (System.in);
                System.out.println("please enter the elements of array");
                int arr[][]=new int [3][3];
                for(int i =0;i<arr.length;i++)
                {
                        for(int j=0;j<arr[0].length;j++)
                        {
                                System.out.print("enter the element no. "+" "+(a)+" ");
                                arr[i][j]=sc.nextInt();
                                a++;
                        }
                }
               
                display(arr);
               

               }
}