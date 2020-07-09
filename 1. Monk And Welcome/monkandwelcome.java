import java.util.*;

class monkandwelcome 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] sum = new int[size];               
        for(int i=0;i<size;i++)
        {
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            arr2[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            sum[i] = arr1[i]+arr2[i];
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(sum[i]+" ");
        }
    }
}
