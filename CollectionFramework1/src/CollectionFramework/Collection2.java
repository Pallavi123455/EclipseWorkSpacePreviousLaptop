//ITERATOR OVER COLLECTION
package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection2 {
		public static void main(String args[]) {
			ArrayList<String> obj=new ArrayList<String>();
			obj.add("prakash");
			obj.add("Joyti");
			obj.add("Suresh");
			obj.add("Neha");
			Iterator ii=obj.iterator();
			while(ii.hasNext())
			{
				System.out.println(ii.next());
			}
		}

	}



