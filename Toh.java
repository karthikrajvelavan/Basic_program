import java.util.Scanner;
class Toh
{       static void recur(int n,char src,char des,char aux)
		{
		  if(0==n)
		  return;
		  else
		  {
		  recur(n-1,src,aux,des);
		  System.out.println(n+" "+src+" "+des);
		  recur(n-1,aux,des,src);
		  }	
		}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	recur(n,'S','D','A');
	}}