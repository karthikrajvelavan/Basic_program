import java.util.Scanner;
class Permutation{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String val=sc.next();
	permu(val,0,val.length()-1);

	}
	static void permu(String str,int l,int r)
	{
		if(l==r)
		System.out.println(str);
		else
		{
		for(int i=l;i<=r;i++)
			{
             str=swap(str,l,i);
             permu(str,l+1,r);
             str=swap(str,l,i);

			}
		}
	}

	static String swap(String a, int i,int j)
	{
	char arr[]=a.toCharArray();
	char temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	return String.valueOf(arr);
	}
}
