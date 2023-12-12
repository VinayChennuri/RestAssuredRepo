package Collections;
import java.util.*;  
public class ListTest {

	public static void main(String[] args) {
		
		List <String> ab = new ArrayList <String>();
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
