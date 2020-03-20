import java.util.Scanner;
class Anagram
{
static Boolean chk(String inp1,String inp2)
{
 char arr1[]=inp1.toCharArray();
 char arr2[]=inp2.toCharArray();
 if(arr1.length!=arr2.length)
 return false;
 for(int i=0;i<arr1.length;i++)
 if(arr1[i]!=arr2[i])
 return false;

 return true;
 	
}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String inp1=sc.next();
	String inp2=sc.next();
	if(chk(inp1,inp2))
	System.out.println("Anagram");
	else
	System.out.println("Not an Anagram");

	}
}
