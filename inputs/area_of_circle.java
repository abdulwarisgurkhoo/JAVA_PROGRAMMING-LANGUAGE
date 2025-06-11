import java.util.*;

public class area_of_circle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the radius of circle wholse area you want to find ");
        float rad = sc.nextFloat();
        double area = 3.142 * rad * rad;
        System.out.println("area of circle is : " + area);
    }
}
