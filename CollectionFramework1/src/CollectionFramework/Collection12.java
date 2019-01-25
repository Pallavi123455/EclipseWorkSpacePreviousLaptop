package CollectionFramework;
import java.util.*;
public class Collection12 {
		public static void main(String args[])
		{
			HashSet<String> aa=new HashSet<String>();
			aa.add("ram");
			aa.add("sam");
			aa.add("chhabi");
			aa.add("kamn");
			aa.add("kat");
			System.out.println("The elements are"+aa);
			boolean isremoved = aa.remove("kat");
			aa.remove("kamn");
			System.out.println("Return value after remove: "+isremoved);
			System.out.println("The elements are"+aa);
		}

	}



