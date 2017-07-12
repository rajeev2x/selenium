
package nonEssential;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 {
	int count = 0 ;

	public static void main(String[] args) {
		int val = 1;
		int count = 0;
		String input = "Hexaware";
		
		 char[] input1 =  input.toCharArray();
		
		Map<Character,Integer> letter  = new HashMap<Character,Integer>();
		
  for (char c : input1) 
	  {
			if(letter.containsKey(c))
			{
                // count = count ++ ;
				 val = letter.get(c);
			   letter.put(c, val+1);
			}
			else
			{

				letter.put(c, val);
			}
			
		}
  System.out.println(letter.entrySet());
  System.out.println(letter);
	}
	
	
}
