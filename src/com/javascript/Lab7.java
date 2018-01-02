package com.javascript;

public class Lab7 {
public static void main(String[] args) {
	I1 ref=new Student();
	I2 ref1=new Student();
	ref.show();
	ref1.dispaly();
	
}
}
interface I1{
	void show();
}
interface I2{
	void dispaly();
}
class Student implements I1,I2{
	public void dispaly() {
		System.out.println("Display in Student");
	}
	public void show() {
		System.out.println("show in Student");
	}
	
}
