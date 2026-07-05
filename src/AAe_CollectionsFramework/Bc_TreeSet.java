package AAe_CollectionsFramework;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Bc_TreeSet {
    public static void main(String[] args) {
        Set<Integer> st = new TreeSet<>();
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);
        System.out.println(st);


        Set<Integer> st1 = new TreeSet<>();
        Set<Integer> st2 = new TreeSet<>();
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
