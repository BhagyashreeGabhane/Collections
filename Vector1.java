package listInterface;


import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<Integer> vv=new Vector<Integer>();
		vv.add(4);
		vv.add(3);
		vv.add(5);
		vv.add(2);
		vv.add(87);
		vv.add(23);
		vv.add(4);
System.out.println(vv);
vv.remove(0);
int a=vv.capacity();
System.out.println(a);	
	
	}

}
