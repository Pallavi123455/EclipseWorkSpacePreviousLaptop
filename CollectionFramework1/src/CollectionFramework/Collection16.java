package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Collection16 {
		public static void main(String[] args) {
			ArrayList<String> aa=new ArrayList<String>();
			aa.add("Ram");
			//Why this element is not coming
			aa.add("Ragh");
			aa.add("Rimu");
			aa.add("Simu");
			aa.add("Ammu");
			aa.add("Ramu");
			//aa.add("Raghu1");
			aa.add("Rimuw");
			aa.add("Simud");
			aa.add("Ammu");
			System.out.println("Before sorting the elements are"+aa);
			for(String counter:aa)
			{
				System.out.println(counter);
			}
			Collections.sort(aa);
			System.out.println("After sorting the elements:");
			for(String counter:aa)
			{
				System.out.println(counter);
			}
			Collections.reverse(aa);
			System.out.println("After sorting the elements:");
			for(String counter:aa)
			{
				System.out.println(counter);
			}
	}

}
