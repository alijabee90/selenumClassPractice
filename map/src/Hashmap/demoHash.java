package Hashmap;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;


public class demoHash {

                public static void main(String[] args) {
			/*	HashMap<Integer,String> map = new HashMap<Integer,String>();
				map.put(1, "Polat");
				map.put(2, "David");
				map.put(3, "Harry");
				//override the key pair value
				map.put(1, "Ajay");
				
				System.out.println(map);
				
				HashMap<String, String> hashInfo = new HashMap<String, String>();
				hashInfo.put("Name", "David");
				hashInfo.put("Job", "Data Analyist");
				hashInfo.put("Company", "Amazon");
				System.out.println(hashInfo);
				
				
				HashMap<Integer, String> map1 = new HashMap<Integer, String>();
				map1.put(1, "Polat");
				
				HashMap<Integer, String> map2 = new HashMap<Integer, String>();
				map2.put(2, "David");
				map2.put(3, "Harry");
				map1.putAll(map2);
				System.out.println(map1);
				
				
				map1.remove(2);
				System.out.println(map1);
				
				System.out.println(map1.containsKey(2));
				System.out.println(map1.containsValue("Harry"));
				System.out.println(map1.get(1));
				System.out.println(map1.keySet());
				System.out.println(map1.size());
				System.out.println(map2.size());
				System.out.println(map1.values());
				System.out.println(map2.values());*/
	
            		HashMap<Integer,String> map = new HashMap<Integer,String>();
            		map.put(1, "Polat");
            		map.put(2, "David");
            		map.put(3, "Harry");
            		Set<Entry<Integer,String>> entries = map.entrySet();
            		
            		Iterator<Entry<Integer,String>> it = entries.iterator();
            		while(it.hasNext()) {
            			Entry<Integer, String> entry = it.next();
            			System.out.println(entry.getKey() + " = " + entry.getValue());
            		}
				}
			}

		
	


