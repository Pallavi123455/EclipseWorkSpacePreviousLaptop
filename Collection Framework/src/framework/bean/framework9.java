package framework.bean;
import java.util.*;
public class framework9 {
	public static void main(String args[])
	{
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
	tm.put(1,"hat");
	tm.put(10,"frt");
	tm.put(5,"gat");
	tm.put(12,"hat");
	tm.put(13,"gat1");
	tm.put(2,"tree");
	tm.put(8,"rte");
	tm.put(3,"pag");
	tm.put(6,"kat");
	tm.put(7,"rtewe");
	for(Map.Entry m:tm.entrySet())
	{
		System.out.println(m.getKey()+""+m.getValue());
	}
	}

}
