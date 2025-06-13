 import java.util.*;
public class THROW_THROWS_BLOCK {
    public static void display(int arr[]) throws ArrayIndexOutOfBoundsException
    {
        System.out.println(arr[100]);
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3};
        try{
            display(arr);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("dont u worry its handled well!");
        }

    animal a1=new animal("DOGGY");
    //a1.display_name;

    }

}
class animal
{
    int height;
    int age;
    int dob;
    String name;
    animal(String str)
    {
        this.name=str;
    }
    public static void displayname()
    {
        System.out.print(this.name);
    }
}