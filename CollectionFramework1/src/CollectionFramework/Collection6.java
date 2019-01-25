//REMOVE A SINGLE ITEM INTO COLLECTION
package CollectionFramework;
import java.util.*;
public class Collection6 {
	public static void main(String args[])
	{
		ArrayList<String> aa=new ArrayList<String>();
		aa.add("Pallavi");
		aa.add("Twinkle");
		aa.add("ram");
		aa.add("Shyam");
		aa.add("Kabi");
		aa.add("nimu");
		System.out.println("Elements are"+aa);
		aa.remove(1);
		System.out.println("Elements are"+aa);
	}

}
