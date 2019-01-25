package framework.bean;
import java.util.*;
public class framework1o {
	public static void main(String args[])
	{
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("ram");
		pq.add("rita");
		pq.add("krt");
		pq.add("sano");
		System.out.println("head:"+pq.element());
		System.out.println("head:"+pq.peek());
		System.out.println("iterating the queue elements");
		Iterator itr=pq.iterator();
		while(itr.hasNext())
		{
			System.out.println("elements "+itr.next());
		}
		pq.remove();
		pq.poll();
		System.out.println("After removing two elements");
		Iterator<String> itr2=pq.iterator();
		while(itr2.hasNext())
		{ 
			System.out.println(itr2.next());
		}
		
	}

}
