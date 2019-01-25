package framework.bean;
import java.util.*;
public class framework6 {
	public static void main(String args[])
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("Rabi");
		hs.add("Ranu");
		hs.add("Raj");
		hs.add("Ranu");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
