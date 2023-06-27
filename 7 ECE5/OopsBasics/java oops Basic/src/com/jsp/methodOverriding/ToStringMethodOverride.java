package com.jsp.methodOverriding;
class Student{
	int id;
	int age;
	String name;
	public Student(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name +"]";
	}
	
	
}
public class ToStringMethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(1,24,"ramu");
		System.out.println(student);
		
	}

}
