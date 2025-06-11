
/**************************prim_or_not.java************************/
import java.util.*;
import java.lang.*;

public class prim_or_not {
    public static void primeornot(int a) {
        int count = 0;
        if (a < 2) {
            System.out.println(a + " is not a prime number");

        } else {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.println(a + " is not a prime number");

            } else {
                System.out.print(a + " is a prime number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number that you want to check if it is prime or not :");
        int num = sc.nextInt();
        primeornot(num);

    }
}
