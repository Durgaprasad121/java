class rectangle{
	double width,height;
	double area(){
		return width*height;
	}
}
class somethingiswrong{
	public static void main(String args[]){
		//double width,height;
		rectangle re=new rectangle();
		re.width=40;
		re.height=50;
		System.out.println("myrect's area is "+re.area());
	}
}