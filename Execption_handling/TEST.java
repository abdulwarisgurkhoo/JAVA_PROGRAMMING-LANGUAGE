import java.util.*;
public class TEST {

    public static void main(String[] args) {
        
     Searching s1=new Searching();

        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println(arr.length*4);
        int a=10;
        // String str[]=new String[10];
        //     for(int i=0;i<str.length;i++)
        //     {
        //         str[i]=sc.nextLine();
        //     }
        //     for(int i=0;i<str.length;i++)
        //     {
        //         System.out.println(str[i]);
        //     }
         int arr2[]={324,567,12,1,2,3,0,65,4};
        System.out.println( s1.lin_search(arr2, 10));

    }
}
class Searching
{
    public int lin_search(int arr[],int 1key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
}