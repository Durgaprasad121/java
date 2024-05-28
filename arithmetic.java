import java.util.*;
class arthameticoper
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		System.out.println("enter c value");
		int c=sc.nextInt();
		System.out.println("enter d value");
		int d=sc.nextInt();
		System.out.println("a+b= "+(a+b));
		System.out.println("a-b= "+(a-b));
		System.out.println("a*b= "+(a*b));
		System.out.println("a/b= "+(a/b));
		System.out.println("b%a= "+(b%a));
		System.out.println("c%a= "+(c%a));
		System.out.println("a++= "+(a++));
		System.out.println("b--= "+(a--));
		System.out.println("d++= "+(d++));
		System.out.println("++d= "+(++d));
	}
}