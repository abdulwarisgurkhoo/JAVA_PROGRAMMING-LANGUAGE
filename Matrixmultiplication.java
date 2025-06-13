public class Matrixmultiplication {
    public static void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void multiplication(int a[][],int b[][])
    {
        int crr[][]=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                // crr[i][j]=0;
                for(int k=0;k<a[0].length;k++)
                {
                    crr[i][j] +=a[i][k]*b[k][j];
                }
            }
        }
        display(crr);
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{6,7,8}};
        int brr[][]={{1,2,3},{4,5,6},{6,7,8}};
        multiplication(arr, brr);
    }
}

