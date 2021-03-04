package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionsFramework {
	// Collection is a framework in java which comes with multiple interface and classes which help us to handle the data
	// which is growing and shrinking in nature


	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Santosh");
		list.add("Subhangi");
		list.add("Anjali");
		
		for (String s:list)
		{
			System.out.println(s);
		}
		
	list = new LinkedList<>();
		
		list.add("Santosh");
		list.add("Subhangi");
		list.add("Anjali");
		
		for (String s:list)
		{
			System.out.println(s);
		}
		
list = new Vector<>();
		
		list.add("Santosh");
		list.add("Subhangi");
		list.add("Anjali");
		
		for (String s:list)
		{
			System.out.println(s);
		}
	}

}
