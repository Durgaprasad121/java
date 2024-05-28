import java.util.*;
class Matmuldemo1{
	public static void main(String args[]){
		int i,j,n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		n=sc.nextInt();
		System.out.println("Enter m value");
		m=sc.nextInt();
		int a[][]=new int[n][m];
		System.out.println("enter the array");
		for(i=1;i<=n;i++)
		  for(j=1;j<=m;j++)
			a[i][j]=sc.nextInt();
	}
} 