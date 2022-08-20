package Set2;

import java.util.TreeSet;

import MapsDis.compairdisc;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts= new TreeSet<Integer>(new compairdisc());
		ts.add(3);
		ts.add(1);
		//ts.add(null); "main" java.lang.NullPointerException
		//remove duplicate
		ts.add(77);
		ts.add(77);
		System.out.println(ts);
		
		
		TreeSet<Integer> ts1= new TreeSet<Integer>(new compairdisc());
		ts1.add(3);
		ts1.add(999);
		ts1.add(7778);
		ts1.add(87);
		ts1.add(1);
		//ts.add(null); "main" java.lang.NullPointerException
		//remove duplicate
		ts1.add(771);
		ts1.add(77);
		System.out.println(ts1);
		

	}

}
