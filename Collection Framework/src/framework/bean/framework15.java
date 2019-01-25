package framework.bean;
import java.util.*;
enum days
{
	Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}
public class framework15
{
	public static void main(String args[])
	{
		Set<days> se=EnumSet.of(days.Tuesday,days.Wednesday);
		Iterator<days> iter=se.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}
