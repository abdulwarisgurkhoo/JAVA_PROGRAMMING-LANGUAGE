public class Demo
{
    public static void main (String args[])
    {
        Display d1=new Display();

        int arr[]={1,2,3,4};
        d1.show(arr, 4);
        System.out.println("\nexecption has been handled efficently");
        int a=20;
        int b=0;
        try{
            System.out.print(a/b);
        }catch(ArithmeticException e)
        {
            System.out.print("\nthe quantity becomse infinity\nBecause num/0=infinity");
        }


    }
}

class Display
{
    public void show(int arr[],int n)
    {
        try
        {
            System.out.print(arr[n]);
        }
        catch(Exception e)
        
        {
            System.out.print(e);
        }

    }
}