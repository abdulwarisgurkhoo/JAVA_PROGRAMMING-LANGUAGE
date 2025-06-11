/*********************************************right_star_triangle*****************************/
import java.util.*;

public class right_star_triangle {
        public static void main (String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the size of triangle \n");
            int size=sc.nextInt();
            for(int i=0;i <= size; i++)
            {
                for (int j=0 ;j<i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }    
}
