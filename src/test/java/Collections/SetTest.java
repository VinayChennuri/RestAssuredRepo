package Collections;
import java.util.*;  
public class SetTest {

	public static void main(String[] args) {
		
		Set <String> ab = new HashSet <String>();
		
		ab.add("Red");
		ab.add("Blue");
		ab.add("Black");
		ab.add("Red");
		ab.add("Brown");
		ab.add("Blue");
		
		for(String cd : ab)
		{
			System.out.println(cd);
		}

	}

}
