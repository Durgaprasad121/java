class a{
	int x=10;
	int y=20;
	void modify(){
		b bobj=new b();
		System.out.println("in the first class a");
		System.out.println(x+" "+y);
		bobj.modify();
		System.out.println(x+" "+y);
	}
	class b{
		void modify(){
			System.out.println("in the class b is excigutad");
			x=x+y;
			y=x-y;
			x=x-y;
		}
	}
}
class c3{
	public static void main(String args[]){
		a aobj=new a();
		aobj.modify();
	}
}
		