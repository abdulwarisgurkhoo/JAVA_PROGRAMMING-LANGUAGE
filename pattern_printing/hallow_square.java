import java.util.*;
public class hallow_square {
    public static void main(String args[]) {
        int i, j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of square");
        int size=sc.nextInt();
        for (i = 1; i <= size; i++) {
            for (j = 1; j <= size; j++) 
            {
                if (i == 1 ||   i== size ||  j == 1 ||  j == size)
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
