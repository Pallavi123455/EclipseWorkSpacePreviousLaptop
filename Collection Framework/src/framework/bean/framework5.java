package framework.bean;
import java.util.*;
class pallavi
{
	int rollno;
	int age;
	public pallavi(int rollno,int age)
	{
		this.rollno=rollno;
		this.age=age;
	}
}
public class framework5 {
	public static void main(String args[])
	{
	List<pallavi> ls=new LinkedList<pallavi>();
	pallavi s1= new pallavi(12,20);
	pallavi s2= new pallavi(13,20);
	ls.add(s1);
	ls.add(s2);
	for(pallavi s:ls)
	{
		System.out.println(s.rollno+""+s.age);
	}
	}
}

	


