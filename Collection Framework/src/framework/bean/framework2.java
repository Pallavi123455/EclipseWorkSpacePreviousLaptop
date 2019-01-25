package framework.bean;
import java.util.*;
public class framework2 {
	public static void main(String args[])
	{
		ArrayList<String> ls=new ArrayList<String>();
		ls.add("Pallavi");
		ls.add("pooja");
		ls.add("anil");
		ls.add("stiti");
		ls.add("pami");
		Iterator<String> ir=ls.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
	}

}
