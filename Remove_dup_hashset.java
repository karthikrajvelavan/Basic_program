import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Remove_dup_hashset
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      String word=sc.next();
	 Set<Character> chars = new HashSet<>();
    char arr[]=word.toCharArray();
    for(int i=0;i<arr.length;i++)
    {
    	chars.add(arr[i]);

    }

     System.out.println(chars);

	}
}		


