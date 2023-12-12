package Collections;
import java.util.*;  
public class HashMapTest {

	public static void main(String[] args) {
		
HashMap <Integer,String> a = new HashMap <Integer,String> (); 
		
		a.put(0,"Apple");
		a.put(1,"Ball");
		a.put(2,"Cat");
		a.put(3,"Dog");
		a.put(null, "bhf");
		a.put(4,null);
		a.put(5,null);
		
		for (Map.Entry b : a.entrySet())
		
		{
			System.out.println(b.getKey()+" "+b.getValue());
		}

	}

}
