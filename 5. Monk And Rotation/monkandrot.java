import java.util.*;
class monkandrot 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int cs, n, i, j, k, a, b, c;
        int[] arr = new int[1000];
		cs=sc.nextInt();
		for(int lp=0;lp<cs;lp++) 
		{
			n=sc.nextInt();
			k=sc.nextInt();
			while(k >= n)
			{
				k -= n;
			}
			for(i = 0; i < n; ++i) 
			{
				arr[i]=sc.nextInt();
			}
			for(i = n-k; i < n; ++i) 
			{
				System.out.print(arr[i]+" ");
			}
			for (i = 0; i < n-k; ++i) 
			{
				System.out.print(arr[i]+" ");
			}
		}
    }
}
