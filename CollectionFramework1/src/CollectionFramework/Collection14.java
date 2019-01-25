//Sort the ArrayList elements as Integer Type
package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Collection14 {
	public static void main(String[] args) {
		ArrayList<Integer> aa = new ArrayList<Integer>();
		aa.add(9);
		aa.add(4);
		aa.add(5);
		aa.add(6);
		aa.add(7);
		System.out.println("Before sorting the elements are" + aa);
		for (Integer counter : aa) {
			System.out.println(counter);
		}
		Collections.sort(aa);
		System.out.println("After sorting the elements:");
		for (Integer counter : aa) {
			System.out.println(counter);
		}

	}
}
