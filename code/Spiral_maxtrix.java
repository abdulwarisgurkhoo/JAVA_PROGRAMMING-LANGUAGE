
/***************************to print the matrix in spiral formate*************************/
import java.util.*;

public class Spiral_maxtrix {
    public static void spiral_print(int arr[][])
    {
        int startrow=0,endrow=arr.length-1;
        int startcol=0,endcol=arr.length-1;
        while(startrow<=endrow && startcol<=endcol)
        {
        //upper
        for(int j=0;j<=endcol;j++)
        {
            System.out.print(arr[startrow][j]+" ");
        }
        //right
        for(int i=startrow+1;i<=endrow;i++)
        {
             System.out.print(arr[i][endcol]+" ");
        }
        //bottom
        for(int j=endcol-1;j>=startcol;j--)
        {
             System.out.print(arr[endrow][j]+" ");
        }
        //left
        for(int i=endrow-1;i>=startrow;i--)
        {
             System.out.print(arr[i][startcol]+" ");
        }
        startrow++;
        startcol++;
        startcol--;
        endcol--;
    }
    }

    public static void display(int arr[][]) {
        System.out.println("the array you entered is :--> ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main (String args[])
    {
        int a=1;
        Scanner sc=new Scanner (System.in);
        int arr[][]=new int [3][3];
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[0].length;j++)
            {
                System.out.println("enter the element no "+a+" : " );
                arr[i][j]=sc.nextInt();
                a++;
            }

        }display(arr);
        spiral_print(arr);
    }
}
