package Colectondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestDemo {

	public static void main(String[] args) {
		
      Map<String,Integer> map=new HashMap<String, Integer>();
      map.put("balaram", 20);
      map.put("ram", 30);
      map.put("arjun", 40);
      map.put("tiger", 50);
      
      System.out.println("keyset"+map.keySet());
      
      System.out.println("keyset"+map.size());
      
      System.out.println("keyset"+map.entrySet());
      Set<Map.Entry<String, Integer>> entry=map.entrySet();
      
      Iterator<Entry<String, Integer>> iterator=entry.iterator();
      
      while(iterator.hasNext()) {
    	  Entry<String, Integer> mapp= (Entry<String, Integer>) iterator.next();
    	  System.out.println(mapp.getKey()+"\t"+mapp.getValue());
      }
      
	}

}
