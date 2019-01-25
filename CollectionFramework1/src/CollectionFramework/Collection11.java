package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class Collection11 {
	public static void main(String args[])
	{
		HashSet<String> aa=new HashSet();
		aa.add("Pallavi");
		aa.add("Twinkle");
		aa.add("ram");
		aa.add("Shyam");
		aa.add("Kabi");
		aa.add("nimu");
		Iterator ii=aa.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
	}
}
