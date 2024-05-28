import java.util.*;
class logoper{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Boolean");
		boolean a=sc.nextBoolean();
		System.out.println("enter b boolean");
		boolean b=sc.nextBoolean();
		System.out.println("a && b = " + (a&&b)); 
 		System.out.println("a || b = " + (a||b) ); 
 		System.out.println("!(a && b) = " + !(a && b)); 
 	} 
} 
