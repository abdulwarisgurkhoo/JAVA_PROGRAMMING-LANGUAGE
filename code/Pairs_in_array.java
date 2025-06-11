
/*******************************************Pairs_in_array***************************************/
import java.util.*;

public class Pairs_in_array {
    public static void display(int arr[]) {
        System.out.print("\nthe array you entered is  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");

        }
    }

    public static void print_pairs(int arr[]) {
        System.out.println("\nthe pairs in array you entered is :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + "),");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        System.out.println("please enter tyhe size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter the element no ." + (i + 1) + " : ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        display(arr);
        print_pairs(arr);

    }
}
