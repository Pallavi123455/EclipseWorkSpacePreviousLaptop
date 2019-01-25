package cframework.bean;

import java.util.HashMap;
import java.util.Map.Entry;

public class Jitu 
{
	public static void main(String args[]) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(11,"palli");
		map.put(12,"palli1");
		map.put(13,"palli2");
		 for(Entry<Integer, String> m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  

}
	}
}
