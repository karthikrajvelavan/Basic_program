import java.util.Scanner;
import java.util.Arrays;
class Nqueens
{
static int n;
static int arr[][];
    
    static void printsol()                                      //printing the solution
    {
        for(int i=0;i<n;i++){
     	for(int j=0;j<n;j++)
     		if(arr[i][j]==1)
     			System.out.print("Q ");
     		else
     			System.out.print("- ");
          System.out.println();
     	}	
    }

    static Boolean isafe(int arr[][],int row,int col)            //checking row and diagonals
    {
        
        for(int j=0;j<col;j++)
        if(arr[row][j]==1)
        return false;

        for(int i=row,j=col;i>=0&&j>=0;--i,--j)
        if(arr[i][j]==1)
        return false;

        for(int i=row,j=col;i<n&&j>=0;++i,--j)
        if(arr[i][j]==1)
        return false;

        return true;
    }

    static Boolean solve(int arr[][],int col)                    //checking all posibilities through recursive
    { 
      if(col>=n){

      printsol();
      return true;}

      for(int i=0;i<n;i++)
      {
         if(isafe(arr,i,col))
         {   
              arr[i][col]=1;
              if(solve(arr,col+1)==true)
              return true;

              arr[i][col]=0;
         }
      }
      return false;
    }
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    arr=new int[n][n];
    for(int i=0;i<n;i++)
    Arrays.fill(arr[i],0);
    if(solve(arr,0)==false)
    System.out.println("Not Formed");
    else
    System.out.println("Formed");
    }
}

output:
4
- - Q -
Q - - -
- - - Q
- Q - -
Formed


