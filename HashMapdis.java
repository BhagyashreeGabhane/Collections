package MapsDis;


import java.util.Collection;
import java.util.Set;
import java.util.WeakHashMap;

public class HashMapdis {

	public static void main(String[] args)
	{
		WeakHashMap<Integer, String> hm=new WeakHashMap<Integer, String>();
		hm.put(100, "aa");
		hm.put(200, "bb");
		hm.put(300, "cc");
		hm.put(400, "dd");
		hm.put(500, "ee");
		System.out.println(hm);
		Set<Integer> keys=hm.keySet();
		System.out.println(keys);
		 //to get value
		Collection<String> value =hm.values();
		System.out.println(value);
		
		//to check key is present or not
		boolean ispresent=hm.containsKey("ff");
		System.out.println(ispresent);
		
		//get value with resp to key
		String aa=hm.get(value);
		System.out.println(aa);
		
		//get value 
	}

}
