
/*********************************right_triagle_using_nos***********************/
import java.util.*;

public class right_triagle_using_nos {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the size of triangle");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
