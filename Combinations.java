import java.util.Scanner;
class Com
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	int arr[]={1,2,3,4,5};
	coms(arr,arr.length,r);
	}

	static void coms(int arr[],int n,int r)
	{
      int data[]=new int[r];
      combiuntil(arr,data,0,n-1,0,r);
	}
	static void combiuntil(int arr[],int data[],int start,int end,int index,int r)
	{
	if(index==r){
				for(int i=0;i<r;i++)
				System.out.print(data[i]+" ");
				System.out.println(" ");
				return;
	            }
	
	for(int i=start;i<=end&&end-i+1>=r-index;i++)
	{
	data[index]=arr[i];
	combiuntil(arr,data,i+1,end,index+1,r);
	}}
}
