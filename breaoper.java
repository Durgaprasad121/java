import java.util.*;
class breaoper
{
	public static void main(String args[]){
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		for(x=0; x<=a; x++ ) { 
		 if( x == 3 || x==4 ||x==6 ) { 
			 break; 
		 } 
		 System.out.print( x ); 
		 System.out.print("\n"); 
		}
	 } 
}
		
		