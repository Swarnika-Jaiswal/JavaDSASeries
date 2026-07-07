package AAe_CollectionsFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Da_MapInterface {
    public static void main(String[] args) {
        Map<String,String> mapping = new HashMap();

//        insertion:
        mapping.put("in", "India");
//        mapping.put("in", "India1");
        mapping.put("en", "England");
        mapping.put("us", "United States");

        System.out.println(mapping);


        Map<String, String> m = new HashMap<>();
        m.put("br", "brazil");
        System.out.println("Before: "+m);
        m.putAll(mapping);
        System.out.println("After: "+m);

//        deletion
        m.remove("en");
        System.out.println(m);

        System.out.println(m.size());
//        m.clear();
//        System.out.println(m.size());

        m.putIfAbsent("in", "India2");
        System.out.println(m);

        System.out.println(m.get("br"));

        System.out.println(m.getOrDefault("u", "NONE"));

        System.out.println(m.containsKey("im"));
        System.out.println(m.containsValue("United States"));

        System.out.println(m);
        m.replace("in", "indonesia");
        System.out.println(m);;

        Set<String> keyset = m.keySet();
        System.out.println(keyset);

        Collection <String> valueSet =  m.values();
        System.out.println(valueSet);

//        get all the entries for now
       Set<Map.Entry<String, String>> entryset =  m.entrySet();
        System.out.println("Printing entries: "+ entryset);

//        iteration over entrySet:
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2,"Two");
        map.put(3,"Three");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey()+", Value: "+ entry.getValue());
        }








    }
}
