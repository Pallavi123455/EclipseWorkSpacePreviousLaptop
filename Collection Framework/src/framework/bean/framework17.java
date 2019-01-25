package framework.bean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class framework17 {
		public static void main(String[] args) {
			// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
			// TODO Auto-generated method stub
			// Why list type collection used in java?
			List<String> dataList = new ArrayList<String>();

			// add operations
			addOne(dataList);//START addOne()
			addMultiple(dataList);
			addAll(dataList);

			// search operations
			findOne("java8", dataList); // search for java
			listContains("java", dataList);
			listContainsAll(dataList);

			// iterators
			iterator(dataList);
			listIterator(dataList); // only for list collection

			// remove operations
			removeOne("hyd", dataList);
			removeAll(dataList);
			retainAll(dataList);

			// list to array
			listToArray(dataList);

			// clear
			clear(dataList);

			addArraysAsList();
			addDuringInit();

			
		}

		private static void listToArray(List<String> dataList) {
			// TODO Auto-generated method stub
			showOpsMessage("START listToArray()", true);
			String[] emptyArr = new String[dataList.size()];
			String[] returnedArr = dataList.toArray(emptyArr);
			System.out.println(emptyArr);
			System.out.println(Arrays.toString(emptyArr));
			System.out.println(Arrays.toString(returnedArr));
			System.out.println(returnedArr == emptyArr);
			showOpsMessage("END listToArray()", false);
		}

		private static void clear(List<String> dataList) {
			showOpsMessage("START clear()", true);
			dataList.clear();
			displayWithAdvancedFor(dataList);
			showOpsMessage("END clear()", false);
		}

		private static void iterator(List<String> dataList) {
			showOpsMessage("START iterator()", true);

			Iterator<String> it = dataList.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
			showOpsMessage("END iterator()", false);
		}

		private static void listIterator(List<String> dataList) {
			// TODO Auto-generated method stub
			showOpsMessage("START listIterator()", true);

			ListIterator<String> it = dataList.listIterator();
			System.out.println("moving forward");
			while (it.hasNext()) {
				System.out.println(it.next());
			}

			System.out.println("\nmoving backword\n");
			while (it.hasPrevious()) {
				System.out.println(it.previous());
			}
			showOpsMessage("END listIterator()", false);
		}

		private static void listContainsAll(List<String> dataList) {

			showOpsMessage("START listContains()", true);

			List<String> searchList = new ArrayList<String>() {
				{
					add("c++");
					add("mum");
					add("python");
				}
			};

			if (dataList.containsAll(searchList)) {
				System.out.println("all are present in the list");
			} else {
				System.out.println("all are not present in the list");
			}

			showOpsMessage("START listContains()", false);

		}

		private static void listContains(String string, List<String> dataList) {

			showOpsMessage("START listContains()", true);
			if (dataList.contains(string)) {
				System.out.println("found element in the list");
			} else {
				System.out.println("not found in the list");
			}
			showOpsMessage("END listContains()", false);

		}

		private static void findOne(String string, List<String> dataList) {
			// manual search
			showOpsMessage("START findOne()", true);
			boolean flag = false;
			for (String findStr : dataList) {
				if (Objects.equals(findStr, string)) {
					System.out.println("found the element in the list");
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Not found in the list");
			}
			showOpsMessage("END findOne()", false);
		}

		private static void retainAll(List<String> dataList) {

			showOpsMessage("START retainAll()", true);
			List<String> courseList = new ArrayList<String>() {
				{
					add("c++");
					add("java");
				}
			};

			dataList.retainAll(courseList);

			displayWithAdvancedFor(dataList);
			showOpsMessage("END retainAll()", false);

		}

		private static void removeAll(List<String> dataList) {

			showOpsMessage("START removeAll()", true);
			List<String> cityList = new ArrayList<String>() {
				{
					add("mum");
					add("blr");
				}
			};

			dataList.removeAll(cityList);

			displayWithAdvancedFor(dataList);
			showOpsMessage("END removeAll()", false);

		}

		private static void removeOne(String string, List<String> dataList) {
			showOpsMessage("START removeOne()", true);

			dataList.remove(string);

			displayWithAdvancedFor(dataList);
			showOpsMessage("END removeOne()", false);

		}

		private static void addArraysAsList() {

			showOpsMessage("START addArraysAsList()", true);

			List<String> cityList = Arrays.asList("hyd", "mum", "blr");

			displayWithAdvancedFor(cityList);
			showOpsMessage("END addArraysAsList()", false);

		}

		private static void addDuringInit() {

			showOpsMessage("START addDuringInit()", true);

			List<String> nameList = new ArrayList<String>() {
				{
					add("john");
					add("mark");
				}
			};
			displayWithAdvancedFor(nameList);
			showOpsMessage("END addDuringInit()", false);
		}

		private static void addAll(List<String> list) {
			showOpsMessage("START addAll()", true);
			List<String> cityList = new ArrayList<String>();
			cityList.add("blr");
			cityList.add("mum");
			cityList.add("hyd");

			list.addAll(cityList);

			displayWithAdvancedFor(list);
			showOpsMessage("END addAll()", false);
		}

		private static void addMultiple(List<String> list) {
			showOpsMessage("START addMultiple()", true);
			list.add("java");
			list.add(".net");
			list.add("python");
			displayWithAdvancedFor(list);
			showOpsMessage("END addMultiple()", false);
		}

		private static void addOne(List<String> list) {
			showOpsMessage("START addOne()", true);
			list.add("c++");
			displayWithAdvancedFor(list);
			showOpsMessage("END addOne()", false);
		}

		public static void displayWithAdvancedFor(Collection col) {
			for (Object obj : col) {
				System.out.println(obj);
			}
		}

		public static void showOpsMessage(String message, boolean flag) {
			if (flag) {
				System.out.println("******" + message + "******");
			} else {

				System.out.println("******" + message + "******\n\n");
			}
		
		}

	}

