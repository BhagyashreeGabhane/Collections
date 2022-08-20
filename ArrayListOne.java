package listInterface;

import java.util.ArrayList;

public class ArrayListOne {

	public static void main(String[] args) 
	{
		ArrayList al =new ArrayList();
		al.add("one");
		al.add(1);
		al.add(true);
		al.add('c');
		System.out.println(al);
		
		ArrayList <Integer> al1 =new ArrayList<Integer>();
		al1.add(2);
		al1.add(3);
		al1.add(4);
		System.out.println(al1);
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("aaaa");
		al2.add("bbb");
		al2.add("ccc");
		System.out.println(al2);
		//remove element
		al2.remove("aaaa");
		System.out.println(al2);
		
		//update any value or insert
		al2.set(1, "ggg");
		System.out.println(al2);
		
		
		//to get value at specific index
		String getstring=al2.get(0);
		System.out.println(getstring);
		
		
		ArrayList<Float> al3=new ArrayList<Float>();
		al3.add(1.2f);
		al3.add(1.56f);
		al3.add(3.4554f);
		System.out.println(al3);
		double get=al3.get(0);
		System.out.println(get);
		
		//add all 
		al.addAll(al3);
		System.out.println(al);
		
		al.addAll(al2);
		System.out.println(al);
		
		al.removeAll(al2);
		System.out.println(al);
		
		//to check ele is present or not
		boolean value=al.contains('c');
		System.out.println(value);
		System.out.println(al.contains("one"));
		
		
		
		
		
		
		
		

		
	}

}
