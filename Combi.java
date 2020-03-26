import java.util.*;
class Combi
{
static int fun(int val)
{    if(val==1)
	return 1;
	else
	return val*fun(val-1);
}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int val=sc.nextInt();
	int arr[]=new int[val];
	for(int i=0;i<val;i++)
	{
	arr[i]=sc.nextInt();
	}
	int hh=fun(val);
    int j=val-1;
     for(int i=0;i<hh-1;i++)
     {
       if(j==1)
       {
       int temp=arr[0];
       arr[0]=arr[val-1];
       arr[val-1]=temp;
       j=val-1;
       }
       else
       {
       int temp=arr[j];
       arr[j]=arr[j-1];
       arr[j-1]=temp;
       j--;
       }
       for(int k=0;k<val;k++)
       System.out.print(arr[k]);
   System.out.println();
      
     }
	}
}