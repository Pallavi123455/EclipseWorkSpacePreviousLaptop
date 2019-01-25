//ADD ITEMS INTO COLLECTION CONSTRUCTOR
package CollectionFramework;
import java.util.*;
import java.util.ArrayList;

public class Collection4 {

 int age;    
String name;  
static ArrayList<Collection4> players = new ArrayList<Collection4>();  
Collection4(String aName) {

    name = aName;
    age = 15;
    players.add(this); 

   }


public static void main(String[] args) {
    // TODO code application logic here
    Collection4 p1 = new Collection4("Peter");
    System.out.println(p1);
    System.out.println(players);
}


}