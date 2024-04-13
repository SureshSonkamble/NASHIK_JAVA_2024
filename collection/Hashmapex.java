package collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmapex {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1, "Aa");map.put(2, "AA");
        map.put(3, "ZZ");map.put(3, "EE");
        map.put(4, "BB");map.put(5, "DD");
        map.put(1, "Ab");
        map.put(1, "Ac"); map.put(1, "Az");
        System.out.println(map);
        System.out.println(map.get(5));
        System.out.println(map.containsValue("Aa"));
        
        
        for(Map.Entry k:map.entrySet()) {
        	//System.out.println(k.getKey());
        	//String val=(String) k.getValue();
        	//System.out.println(val);
        	
        	System.out.println(k.getKey()+":"+k.getValue());
        }
        
        
        
      //-------------------------------------
//        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
//        hm.put(1,11);hm.put(2, 2);
//        hm.put(3,3);hm.put(3, 3);
//        hm.put(4,4);hm.put(5, 5);
//        hm.put(1,22);
//        hm.put(1,33); hm.put(1,44);
//        System.err.println(hm);
//        System.err.println(hm.get(1));
//        System.err.println(hm.containsValue(44));
        
	}

}
