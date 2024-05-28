import java.io.*;
class Addition
{
		void add(int x1,int x2) {
			int x4=x1+x2;
			System.out.println("the sum of two numbers "+x1+" and "+x2+" is "+x4);
		}
		void add(int x3,int x1,int x2,int x4) {
			x3=x1+x2+x4;
			System.out.println("the sum of three numbers "+x1+" and "+x2+" and "+x4+" is "+x3);
		}
		void add(double f1,double f2) {
			double f3=f1+f2;
			System.out.println("the sum of two numbers "+f1+" and "+f2+" is "+f3);	
		}
		void add(double d1,double d2,double d3) {	
			double d4=d1+d2+d3;
			System.out.println("the sum of three numbers "+d1+" and "+d2+" and "+d3+" is "+d4);
		}
}
class AdditionDemo
{
	public static void main(String args[])
	{
		Addition a=new Addition();
		int x1=10,x2=20;
		a.add(x1,x2);
		int x3=30;
		a.add(x1,x2,x3);
		double f1=2.54,f2=4.42;
		a.add(f1,f2);
		double d1=2.56,d2=5.76,d3=9.56;
		a.add(d1,d2,d3);
	}
} 