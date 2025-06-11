/***********************************************Print_right_triangle_using_letters**************************/
import java.util.*;
public class Print_right_triangle_using_letters {
        public static void main (String args[])
        {
            char a='A';
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the size of trinagle");
            int size=sc.nextInt();
            for(int i=0;i<=size;i++)
            {
                
                for(int j=0;j<i;j++)
                {
                    System.out.print(a+" ");
                    a++;
                }
                System.out.println();
            }
        }
        
}    
        
