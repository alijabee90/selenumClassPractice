package TreeMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;
public class demoTree {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(1, "Data1");
		tmap.put(23, "Data2");
		tmap.put(70, "Data3");
		tmap.put(4, "Data4");
		tmap.put(2,  "Data5");
		
		Set<Entry<Integer,String>> set = tmap.entrySet();
		Iterator<Entry<Integer,String>> it = set.iterator();
		while(it.hasNext()) {
			Entry<Integer,String> entry = it.next();
			System.out.println("Key is: " + entry.getKey() + " & Value is :" + entry.getValue());
		}

	}

}
