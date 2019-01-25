package framework.bean;
import java.util.*;
public class framework11 
{
	public static void main(String args[])
	{
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("Ravi");
		dq.add("Rimu");
		dq.add("Ritu");
		dq.add("Rinu");
		for(String str:dq)
		{
			System.out.println(str);
		}
		
	}

}
