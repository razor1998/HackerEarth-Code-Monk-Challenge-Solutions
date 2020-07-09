import java.util.*;
import java.lang.*;
class littlemonk 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		char ch;
		int i, c, a;
        String str=sc.next();
		a = c = 0;
		for(i=0; str.length(); ++i) 
		{
			ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			{
				a++;
			}
			else 
			{
				a = 0;
			}
			c = Math.max(c, a);
		}
		System.out.print(c);
    }
}
