package framework.bean;
import java.util.*;
public class framework12 {
	public static void main(String args[])
	{
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Rabi");
		hm.put(2,"Sniti");
		hm.put(3,"SALU");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}

}
