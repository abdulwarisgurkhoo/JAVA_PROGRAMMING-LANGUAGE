/*****************************printing_square.java***********************/
import java.util.*;
public class printing_square{
    public static void main (String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter the size of square");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}