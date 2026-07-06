package AAe_CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

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




    }
}
