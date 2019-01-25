package framework.bean;
import java.util.*;
class Student
{
	int rollno;
	int mark;
	Student(int rollno,int mark)
	{
		this.rollno=rollno;
		this.mark=mark;
	}
}
public class framework3 {
	public static void main(String args[])
	{
		Student s1=new Student(12,89);
		Student s2=new Student(13,89);
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		Iterator<Student> itr=al.iterator();
		while(itr.hasNext())
		{
			Student st=itr.next();
			System.out.println(st.rollno+""+st.mark);
		}
		
	}

}
