package CollectionFramework;

import java.util.HashSet;

public class Collection10 {
	public static void main(String args[]) {
		HashSet<String> aa = new HashSet<String>();
		aa.add("ram");
		aa.add("sam");
		aa.add("chhabi");
		aa.add("kamn");
		aa.add("kat");
		System.out.println("The elements are" + aa);
		aa.clear();
		System.out.println("The elements are" + aa);
	}

}
