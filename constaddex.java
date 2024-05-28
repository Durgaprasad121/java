import java.io.*;
class add{
	int x,y,total;
	add(){
		x=10;
		y=20;
	}
	add(int a)
	{
		x=a;
		y=a;
	}
	add(int a,int b){
		x=a;
		y=b;
	}
	void sum(){
		total=x+y;
		System.out.println("sum= "+total);
	}
}
class democonstaddex
{
	public static void main(String args[]){
		add obj1=new add();
		add obj2=new add(10);
		add obj3=new add(15,30);
		obj1.sum();
		obj2.sum();
		obj3.sum();
	}
}
		