package framework.bean;
import java.util.*;
public class framework13 {
	public static void main(String args[])
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Pallavi");
		hm.put(2,"Priti");
		hm.put(3,"kitu");
		System.out.println("Before removal of elements"+hm);
		hm.remove(1);
		System.out.println("Afteer removal of elements"+hm);
	}

}
