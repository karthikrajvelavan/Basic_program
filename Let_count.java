import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Let_count
{
static final int cou=256;
static void letter(String str,int count[])
{
		for(int i=0;i<str.length();i++)
		count[str.charAt(i)]++;
}
static void printDups(String inp1) 
{
	 int count[]=new int[cou];
	 letter(inp1,count);
	 for(int i=0;i<cou;i++)
	 { if(count[i]>1)
	 System.out.printf("%c  count=%d\n",i,count[i]);
	 }
}
	public static void main(String args[]) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String inp=br.readLine();
	printDups(inp) ;


	}
}
