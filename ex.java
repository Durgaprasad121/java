import java.io.*;
class ex{
	public static void main(String args[]){
		int n=7,i,j;
		for(i=2;i<=n;i++)
		{
			for(j=i;j<n;j++)
			{
				if(i%j==0)
				System.out.println(n+"prime");
				else
				{
				System.out.println("not a prime");
				}
			}
		}
		
	}
}