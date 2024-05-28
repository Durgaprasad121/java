import java.util.*;
class bitoper{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		int c;
		c = a & b; /* 12 = 0000 1100 */ 
 		System.out.println("a & b = " + c ); 
 		c = a | b; /* 61 = 0011 1101 */ 
 		System.out.println("a | b = " + c ); 
 		c = a ^ b; /* 49 = 0011 0001 */ 
 		System.out.println("a ^ b = " + c ); 
 		c = ~a; /*-61 = 1100 0011 */ 
 		System.out.println("~a = " + c ); 
 		c = a << 2; /* 240 = 1111 0000 */ 
 		System.out.println("a << 2 = " + c ); 
 		c = a >> 2; /* 215 = 1111 */ 
 		System.out.println("a >> 2 = " + c ); 
 		c = a >>> 2; /* 215 = 0000 1111 */ 
 		System.out.println("a >>> 2 = " + c ); 
 	} 
} 