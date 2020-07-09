import java.util.*;
class monkpalindrom 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int cs = sc.nextInt();
        for(int y=0;y<cs;y++)
		{
			String str = sc.next();
			int len =str.length();
			int i = 0;
			int j = len-1;
			while (i < j) 
			{
				if(str.charAt(i) != str.charAt(j)) 
				{
					break;
				}
				i++;
				j--;
		    }
			if (i >= j) 
			{
				System.out.print("YES ");
				if (len%2==0) 
				{
					System.out.println("EVEN");
				} 
				else 
				{
					System.out.println("ODD");
				}
		    } 
			else 
			{
				System.out.println("NO");
		    }
		}
    }
}
