/************************to prinnt max subarray sum in array using brute force approuch*************************/
public class ArraySum
    {
        public static void max_sum_array(int arr[])
        {
           
            int currentsum;
            int maxsum=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {   currentsum=0;
                    for(int k=i;k<=j;k++)
                    {
                        currentsum +=arr[k];
                        System.out.print(arr[k]);
                    }
                    if(currentsum>maxsum)
                    {
                        maxsum=currentsum;
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println("the max sum of sub_array is : "+maxsum);

        }
        public static void kadane(int arr[])
        {
            int cs=0;
            int ms=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++)
            {
                cs +=arr[i];
                if(cs<0)
                {
                    cs=0;
                }
                if(cs>ms)
               {
                ms=cs;
               }
            }
            System.out.print("\nthe maximim sum subarray is :"+ms);

        }
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5};
           // max_sum_array(arr);
           kadane(arr); 
               }
    }