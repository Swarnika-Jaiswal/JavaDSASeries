package AAe_CollectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bb_LinkedListHashSet {
    public static void main(String[] args) {
        Set<Integer> st = new LinkedHashSet<>();
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);
        System.out.println(st);


        Set<Integer> st1 = new LinkedHashSet<>();
        Set<Integer> st2 = new LinkedHashSet<>();
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
