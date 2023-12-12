package Collections;
import java.util.*;  
public class MapTest {

	public static void main(String[] args) {
		
		Map <Integer, String> ab = new HashMap <Integer, String>();
		ab.put(1, "One");
		ab.put(2, "Two");
		ab.put(3, "Three");
		ab.put(1, "One");
		ab.put(null, null);
		ab.put(null, "ab");
		
		for	(Map.Entry<Integer, String> c : ab.entrySet())
		{
			System.out.println(c.getKey()+" "+ c.getValue());
		}

	}

}
