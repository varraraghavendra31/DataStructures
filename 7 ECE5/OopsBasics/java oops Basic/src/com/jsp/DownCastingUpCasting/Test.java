package com.jsp.DownCastingUpCasting;
class Student{
	String name;
	public Student(String name) {
		this.name=name;
		
	}
	public void changeName(Object s1) {
//		this.name=s1.name.toString();
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
//	public Student getObject() {
//		return new Student();
//	}
}
public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Student s1 = new Student("ram");
		Student s2 = new Student("suresh");
		System.out.println(s1);
		System.out.println(s2);
		s2.changeName(s1);
		System.out.println(s2);
		

	}

}
