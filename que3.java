class Box{
	double length=1.0,width=1.0,height=1.0;
	Box(double w,double h,double l){
	{
		width=w;
		height=h;
		length=l;
	}
	Box(){
		System.out.println("the parameter are not declared");
	}
	Box(double length){
		System.out.println("the length is"+length);
	}
	Box(double length,double width){
		System.out.println("the length and width is "+length+" "+width);
	}
	Box(double length,double width,double height){
		System.out.println(height+" "+width+" "+length);
	}
	Box(double length,double height){
		System.out.println(height+" "+length);
	}
	double volume() {
 		return length*width*height;
	}
}
Class demo
{
 	public static void main(String args[]){
 		Box b1=new Box();
		Box b2= new Box(10);
 		Box b3= new Box(10,20);
 		Box b4= new Box(10,20,30);
 		Box b5=new Box (b3,40);
 		System.out.println("volume of Box 1" + b1.volume()); 
 		System.out.println(" volume of Box 2" + b2.volume());
 		System.out.println(" volume of Box 3" + b3.volume());
		System.out.println("volume of Box 4" + b4.volume());
 		System.out.println(" volume of Box 5" + b5.volume());
	}
}