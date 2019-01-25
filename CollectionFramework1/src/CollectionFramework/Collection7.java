//CLEAR ALL ELEMENTS FROM THE COLLECTION
package CollectionFramework;
import java.util.*;
public class Collection7 {
public static void main(String args[])
{
	ArrayList<String> aa=new ArrayList<String>();
	aa.add("mitu");
	aa.add("Nitu");
	aa.add("Situ");
	System.out.println("Elements are"+aa);
	aa.removeAll(aa);
	System.out.println("Elements are"+aa);
}
}
