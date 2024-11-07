import java.util.*;
class transpose
{
	public static void main(String args[])
	{
		int arr[][]=new int[50][50];
		int trp[][]=new int[50][50];
		Scanner s1=new Scanner(System.in);
		int i=0,j=0;
		System.out.println("Enter row no. : ");
		int m=s1.nextInt();
		System.out.println("Enter column no. : ");
		int n=s1.nextInt();
		System.out.println("Enter matrix elements : ");
		for (i=0;i<=m-1;i++)
		{
			for(j=0;j<=n-1;j++)
			{
				arr[i][j]=s1.nextInt();	
			}
		}
		System.out.println("The transpose of given matrix is ");
		for (i=m;i>-1;i--)
		{System.out.println("\n");
			for(j=n;j>-1;j--)
			{
				System.out.println(arr[i][j]);	
			}
		}
		s1.close();
				

	}
}
