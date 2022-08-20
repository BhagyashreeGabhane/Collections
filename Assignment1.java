import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment1 {

	public static void main(String[] args) 
	{
		//WAP to count the characters occurs inside a String - "communittee" using hash map
		String s="communittee";
		int count=0;
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, s);
		System.out.println(hm);
		Set<Entry<Integer,String>>	ne=hm.entrySet();
		for(Entry<Integer,String> ne2:ne) 
		{
			String value=ne2.getValue();
			System.out.println(ne2);
			System.out.println(value);
			for(int i=0;i<s.length();i++)
			{
				for(int j=i+1;j<s.length();j++) 
				{
					
//					
//					char[] ch=value.toCharArray();
//					char c1=s.charAt(i);
//					int c2=s.indexOf(i);
//			//if(s.charAt(i)==s.charAt(i))
//					if(c1==c2) {
//				count++;
//					}
//			System.out.println("character is " +c1+ " index position is " +c2);
			}
			}
		}		
		
	}

}
