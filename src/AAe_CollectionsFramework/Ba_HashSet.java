package AAe_CollectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class Ba_HashSet {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);
        System.out.println(st);


        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();
        st1.add(1);
        st1.add(2);
        st1.add(3);
        st1.add(4);
        st2.add(3);
        st2.add(4);
        st2.add(5);
        st2.add(6);
        System.out.println(st1);
        st1.retainAll(st2);
        System.out.println(st2);


        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st1.containsAll(st2));
        System.out.println(st2.containsAll(st1));





    }
}
