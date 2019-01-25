package CollectionFramework;
import java.util.*;
public class Collection17 {
	public static void main(String args[])
	{
		ArrayList<String> aa=new ArrayList<String>();
		Collection17 cc=new Collection17();
		cc.addOneElement(aa);
		cc.addMoreElement(aa);
		cc.addAllElement(aa);
		cc.displayElements(aa);
		if(aa!= null)
		{
			System.out.println("Enter into this addParticularPos()");
			cc.addParticularPos(aa);
	}
		else
		{
			System.out.println("There is no elements so has only one position");
		}
	}
	void displayElements(Collection pp)
	{
		for(Object obj:pp)
		{
			System.out.println(obj);
		}
	}
	void addParticularPos(ArrayList<String> aa) 
	{
		aa.add(3,"f");
		aa.add(5,"M");
		displayElements(aa);
	}
	void addOneElement(ArrayList<String> aa)
	{
		System.out.println("this is adding for one element in arraylist");
		aa.add("A");
	   	displayElements(aa);
	}
	void addMoreElement(ArrayList<String> aa)
	{
		System.out.println("this is adding for more number of element in arraylist");
		aa.add("B");
		aa.add("c");
		aa.add("d");
		aa.add("f");
		aa.add("g");
		aa.add("b");
		aa.add("s");
		aa.add("a");
		displayElements(aa);
	}
	void addAllElement(ArrayList<String> aa)
	{
		System.out.println("This is the adding of each and every elements in the arraylist");
		aa.add("d");
		aa.add("d");
		aa.add("w");
		aa.add("f");
		aa.add("g");
		aa.add("b");
		displayElements(aa);
	}
	
}
