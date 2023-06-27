package copyconstructor;
class Student{
	int id;
	String name;
	int age;
	public Student(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public Student(int id,String name,Student s) {
		this.id=id;
		this.name=name;
		this.age=s.age;
		
	}
	public Student(int id,Student s,int age) {
		this.id=id;
		this.name=s.name;
		this.age=age;
		
	}
	public Student(int id,Student s1,Student s2) {
		this.id=id;
		this.name=s1.name;
		this.age=s2.age;
		
	}
	public void studentDetails() {
		System.out.println("id: "+this.id);
		System.out.println("name: "+this.name);
		System.out.println("age: "+this.age);
		
		System.out.println("********************************************");
	}
}
public class  CopyConstructorTest {
	public static void main(String[] args) {
	Student s = new Student(1,"raj",23);
	s.studentDetails();
	

	Student s1 = new Student(2,"vani", s);
	s1.studentDetails();
	
	Student s2 = new Student(2,s, 24);
	s2.studentDetails();
	
	Student s3= new Student(2,s1, s2);
	s3.studentDetails();
	
	}

}
