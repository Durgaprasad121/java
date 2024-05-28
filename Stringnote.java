import java.util.*;
class Stingnote{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String v,a;
		a=s.reverse();
		if(s==a)
		{
			System.out.println("the given string is palindrome "+s);
		}
		else
		{
			System.out.println("the given string is not a palindrome "+s);
		}
	}
}