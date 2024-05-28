import java.util.*;
class controlexample{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("enter no of elements");
		int n=sc.nextInt();
		String name[]=new String[n];
		for(i=0;i<n;i++)
			name[i]=sc.nextString();
		for(String names:name){
			System.out.println(name);
		}
	}
}
			

