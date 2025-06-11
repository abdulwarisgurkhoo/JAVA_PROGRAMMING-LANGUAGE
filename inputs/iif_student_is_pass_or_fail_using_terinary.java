/**************************iif_student_is_pass_or_fail_using_terinary.java*******************************/
import java.util.*;
public class iif_student_is_pass_or_fail_using_terinary
{
    public static void mian (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE MARKS OF STUDENT :");
        float mark=sc.nextFloat();
        String result= (mark>=33)?"STUDENT IS PASS":"STUDENT IS FAIL";
        System.out.println(result);

    }
}