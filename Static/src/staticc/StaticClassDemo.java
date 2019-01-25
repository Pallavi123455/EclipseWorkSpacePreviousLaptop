package staticc;
import java.util.*;
 class StaticClassDemo1 {
	String name;//DataMember
	static int rollno;//DataMember
	StaticClassDemo1(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	void Demo1()
	{
		System.out.println("Divya"+rollno);
		System.out.println("Mama"+name);
		System.out.println("Divya"+rollno);
	}
	static void Demo()
	{
		System.out.println("Divya"+rollno);
		System.out.println("Mama"+name);
			
			
	}
}
	class StaticClassDemo
	{
	public static void main(String args[])
	{
		StaticClassDemo1 dd1=new StaticClassDemo1("hi",12);
		StaticClassDemo1 dd2 = null;
		StaticClassDemo1 dd3=new StaticClassDemo1("PALLAVI",20);
		System.out.println(dd1.name);
		System.out.println(dd1.rollno);
		
		System.out.println(dd2.rollno);
		System.out.println(StaticClassDemo1.rollno);
		
		
		System.out.println(dd3.rollno);//20
		System.out.println(dd3.name);//PALLAVI
		System.out.println(dd1.rollno);//20
		System.out.println(dd1.name);//PALLAVI
		
		
		//System.out.println(rollno);
		//System.out.println(name);
		
	
	}
	}
