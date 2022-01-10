import java.util.HashMap;
import java.util.Map;

public class NoofOccurance {

	public static void main(String[] args) {
		String str = "aaaabbbbcccdddd";
		
		Map<Character , Integer> hm = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) 
		{
			char c = str.charAt(i);
			if(hm.containsKey(c)) 
			{
				hm.put(c, hm.get(c)+1);
			}
			else 
			{
				hm.put(c, 1);
			}
			
		}
				
		System.out.println(hm.get('a'));
	}

}
