/**********************************tTO CHECK IF THE USER ENTERED STRIGN IOS A PALINDROME OR NOT*********************/
import java.util.*;

public class Palindrome_string {
  public static boolean ispalindrome(String str) 
  {
        int i=0,j=str.length()-1;
        while(i<=j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
           
        } 
        return true;
  }  
      public static void main(String args[])
  {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the word please that you want to check palindrome or not");

            String word=sc.nextLine();
            System.out.println(ispalindrome(word));



  }
}
