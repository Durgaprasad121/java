class Rectangle {         
	 double width,height;         
	 double area() { 
                    return width * height; 
          } 
}    
class SomethingIsWrong {    
	public static void main(String args[]a) {        
	 Rectangle myRect=new Rectangle();         
	  myRect.width = 40;       
	  myRect.height = 50; 
        System.out.println("myRect's area is " + myRect.area()); 
    } 
} 
