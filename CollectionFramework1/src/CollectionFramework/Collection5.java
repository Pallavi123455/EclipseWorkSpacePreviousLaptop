//FIND A SINGLE ITEM IN A COLLECTION
package CollectionFramework;
import java.util.*;
public class Collection5 {
	public static void main(String args[])
	{
	ArrayList<String> aa=new ArrayList<String>();
	aa.add("cat");
	aa.add("Rat");
	aa.add("mat");
	String str= aa.get(2);
	System.out.println("the elements at a particular position is: "+str);
}
}
