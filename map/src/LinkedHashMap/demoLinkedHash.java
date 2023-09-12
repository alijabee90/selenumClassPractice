package LinkedHashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;
public class demoLinkedHash {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer,String>();
		lmap.put(22, "David");
		lmap.put(33, "Sherry");
		lmap.put(1, "Jim");
		lmap.put(2, "Ajay");
		lmap.put(100, "Micheal");
		
		Set<Entry<Integer, String>> set = lmap.entrySet();
		
		Iterator<Entry<Integer,String>> iterator = set.iterator();
		while(iterator.hasNext()) {
			Entry<Integer,String> entry = iterator.next();
			System.out.println("Key is: " + entry.getKey() + " Value is: " + entry.getValue());
		}

	}

}
