//Find the length of ArrayList
package CollectionFramework;

import java.util.ArrayList;

public class Collection13 {
	public static void main(String[] args) {
		ArrayList<Integer> aa=new ArrayList<Integer>();
		aa.add(12);
		aa.add(13);
		aa.add(14);
		aa.add(15);
		System.out.println("The size of the arraylist is"+aa);
		System.out.println("The elements of the arraylist are"+aa);
		aa.remove(0);
		aa.remove(0);
		System.out.println("The size of the arraylist is"+aa);
		System.out.println("The elements of the arraylist are"+aa);
	}
}
