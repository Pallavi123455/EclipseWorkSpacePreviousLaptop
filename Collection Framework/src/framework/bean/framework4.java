package framework.bean;
import java.util.*;
public class framework4 {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("ravi");
		al.add("ravi1");
		al.add("ravi2");
		al.add("ravi3");
		al.add("ravi4");
		ArrayList<String> al2=new ArrayList<String>();
		al.add("ravi");
		al.add("Suni");
		al.removeAll(al2);
		System.out.println();
	}

}
