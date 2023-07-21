import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Pallindrome {
	
	public static void main(String[] args) {
		
		System.out.println(sortString("racecar"));
		
}
	
	public static boolean sortString(String s) {
		
		List<Character> chars = new ArrayList<>();
		for (char c : s.toCharArray()){
			chars.add(c);	
		}
		List<Character> sortedChars = new ArrayList<>(chars);
		Collections.sort(sortedChars);
		
		List<Character> reversedChars= new ArrayList<>(chars);
		Collections.reverse(reversedChars);
		
		return chars.equals(reversedChars);
	}
	
}
