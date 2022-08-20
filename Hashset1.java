package Set2;


import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {
		HashSet<Integer> al =new HashSet<Integer>();
		//remove duplicate and null also allowed
		al.add(3);
		al.add(1);
		al.add(null);
		al.add(77);
		al.add(77);
		System.out.println(al);
		

	}

}
