class Student {
 int rno;
 String name;
 float cgpa;
 Student( int rollno, String name, float cgpa){
 rno=rollno;
 name = name;
 cgpa =cgpa;
 }
 void display() {
 System.out.println(“rno= ”+rno);
 System.out.println(“student name = ”+name);
 System.out.println(“grade point avg=”+cgpa);
}
class StudentDemo {
 public static void main(String args[]) {
 Student s1= new Student(101,”Ramesh”,3.56f);
 Student s2= new Student(101,”Ramesh”,3.56f);
 Student s3= new Student(101,”Ramesh”,3.56f);
 s1.display();
 s2.display();
 s3.display();
 }
}