class A {
 int x=10;
 int y=20;
 void modify() {
 B Bobj=new B();
System.out.println(x+" "+y);
Bobj.modify();
 System.out.println(x+" "+y);
 }
 static class B {
 void modify() {
 x=x+y;
 y=x-y;
 x=x-y;
 } 
 }
}
class C3 {
 public static void main(String 
 args[]){
 A Aobj=new A();
 Aobj.modify();
}
}
