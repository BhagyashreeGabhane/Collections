package listInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class Conversion {

	public static void main(String[] args) {
		//conversion of array to arry list
		String [] s= {"aaa","bbb","ccc","dd"};
		
		ArrayList<String> as=new ArrayList<String>(Arrays.asList(s));
		System.out.println(as);
	//conversion of array list to array	
ArrayList<Integer> ai=new ArrayList<Integer>();
ai.add(2);
ai.add(23);
ai.add(24);
ai.add(25);
Integer[] a=new Integer[ai.size()]	;	
		ai.toArray(a);
		for(int ne:a)
		{
			System.out.println(ne);
		}
		
	}

}
