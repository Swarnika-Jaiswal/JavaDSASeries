package CollectionsFramework;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.*;

public class Main {
    public static void main(String[] args) {


//    ArrayList -> concrete class
//    ArrayList<Integer> arr = new ArrayList<>();
//    Collection<Integer> collection = new ArrayList<>();
      List<Integer> list = new ArrayList<>();

//      add values in list:
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

//      remove values:
        list.remove(1);
        System.out.println(list);

//       creating another list:
        List<Integer> list1 = new ArrayList<>();
        list1.add(101);
        list1.add(102);
        list1.add(103);
        System.out.println(list1);

//      adding list1 ti list:
        list.addAll(list1);
        System.out.println(list);
        System.out.println(list1);

//        removing list1 from list:
        list.removeAll(list1);
        System.out.println(list);

//        size of an list:
        System.out.println(list.size());

//       clearing all elements from list1:
        list1.clear();
        System.out.println(list1);

//        traversing list using iterator:
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(("Elements: ")+ iterator.next());
        }

//     get() & set() methods:
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2.get(0));
        System.out.println("before set: " + list2);
        list2.set(0,100);
        System.out.println("after set: " + list2);

//        toArray() -> converts any collection into array:
        Object[] arr =  list2.toArray();
        for(Object obj: arr){
            System.out.println(obj);
        }


//     contains():
        System.out.println(list2.contains(3));
        System.out.println(list2.contains(4));

//     sort():
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(23);
        list3.add(5);
        list3.add(44);
        Collections.sort(list3);
        System.out.println("Elements in list after sorting: " + list3);









    }
}
