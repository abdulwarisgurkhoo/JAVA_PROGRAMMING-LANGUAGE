/****************************************TO FIND Max_Sum _SubArray USING BRUTE FORCE**********************************/
public class Max_Sum _SubArray {
    public static void max_sumsub(int arr[])
    {
           
            int maxsum=0;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i;j<arr.length;j++)
                {
                     int currsum=0;
                    for(int k=i;k<j;k++)
                    {
                        currsum +=arr[k];
                    }
                    if(currsum>maxsum)
                    {
                        maxsum=currsum;
                    }
                }
            } 
            System.out.println("THE MAXIMUM SUBARRAY SUM IS : "+maxsum); 
    }
    public static void main (String args[])
    {
        int arr[]={1,2,3,4,5};
        max_sumsub(arr);

    }
    
}
