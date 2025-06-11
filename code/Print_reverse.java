public class Print_reverse {
    public static void main (String args[])
    {
            int num=123;
            int last=0;
            while(num>0)
            {
                last=num%10;
                System.out.print(last);
                num /=10;
            }
    }
}
