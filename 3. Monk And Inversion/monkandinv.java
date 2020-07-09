import java.util.*;
class monkandinv 
{
    public static void main(String args[] ) throws Exception 
    {
		Scanner sc = new Scanner(System.in);
        int c, t, n, i, j, k, cnt = 0, x, y;
        int[][] arr = new int[21][21];
		t=sc.nextInt();
		for(int r=0;r<t;r++)
		{
			n=sc.nextInt();
			c = 0;
			for(i = 0; i < n; ++i) 
			{
				for(j = 0; j < n; ++j) 
				{
					arr[i][j]=sc.nextInt();
				}	
			}

			for (i = 0; i < n; ++i) 
			{
				for (j = 0; j < n; ++j) 
				{
					for (x = i; x < n; ++x) 
					{
						for (y = j; y < n; ++y) 
						{
							if (arr[x][y] < arr[i][j])
							c++;
						}
					}
				}
			}

			System.out.println(c);
        }
    }
}