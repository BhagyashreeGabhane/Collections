package Set2;

import java.util.LinkedHashSet;

public class LinkedHashSet2 {

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> lhs= new LinkedHashSet<Integer>();
		lhs.add(3);
		lhs.add(1);
		lhs.add(null);
		lhs.add(77);
		lhs.add(77);
		System.out.println(lhs);
		
	}

}
