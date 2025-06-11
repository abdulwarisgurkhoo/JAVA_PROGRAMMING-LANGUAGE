public class Reverse_num {
    public static void main (String args[])
    {
        int num=123;
        int reverse=0;
        int last=0;
        while(num>0)
        {
            last=num%10;
            reverse=reverse*10+last;
            num /=10;
        }
        System.out.print(reverse);
    }
}
