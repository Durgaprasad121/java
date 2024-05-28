import java.util.*;
class Matmul
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,k,l,m,n;
		System.out.println("enter the size of matrix:");
		n=sc.nextInt();
		m=sc.nextInt();
		l=sc.nextInt();
		int a[][]=new int[n][m];
		int b[][]=new int[n][m];
		int c[][]=new int[n][m];
		System.out.println("enter the matrix1");
		for(i=0;i<n;i++)
		  for(j=0;j<m;j++)
			a[i][j]=sc.nextInt();
		System.out.println("enter the matrix2");
		for(i=0;i<n;i++)
		  for(j=0;j<m;j++)
			b[i][j]=sc.nextInt();
		for(i=0;i<n;i++)
		  for(j=0;j<m;j++)
		    for(k=0;k<l;k++)
			c[i][j]=a[i][k]*b[k][j]+c[i][j];
		System.out.println("the multiplication of a matrix is");
		for(i=0;i<n;i++)
		{
		  for(j=0;j<m;j++)
			System.out.print(c[i][j]+" ");
		System.out.println();
		}
	}
}