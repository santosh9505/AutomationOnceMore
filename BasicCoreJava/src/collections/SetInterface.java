package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		
		Set<Integer> set = new HashSet<>(); //internally hashmaps

		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		for(Integer s :set)
		{
			System.out.println(s);
		}
		
		System.out.println("***********************************************************");
		
		
set = new LinkedHashSet<>(); // preserves insertion orders

		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		for(Integer s :set)
		{
			System.out.println(s);
		}
		
		System.out.println("***********************************************************");
		
    set = new TreeSet<>(); // Default sorting

		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		for(Integer s :set)
		{
			System.out.println(s);
		}
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext())
		System.out.println(it.next());
		
	}

}
