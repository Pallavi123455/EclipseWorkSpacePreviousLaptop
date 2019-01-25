package framework.bean;
import java.util.*;
public class framework14 {
	public static void main(String args[])
	{
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(1,"rabi");
		lhm.put(2,"rabi1");
		lhm.put(3,"rabi2");
		lhm.put(4,"Sakshi");
		System.out.println("The elements are:"+lhm);	
		for(Map.Entry m:lhm.entrySet())
		{
		System.out.println(m.getKey()+""+m.getValue());	
		}

	}

}
