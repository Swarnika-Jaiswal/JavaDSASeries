package AAe_CollectionsFramework;
import java.util.LinkedList;
import java.util.Queue;

public class Aca_LinkedList {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
//        add()
        q.add(10);
        q.add(20);
        System.out.println("add-> "+q);
//        offer()
        q.offer(30);
        q.offer(40);
        System.out.println("offer-> "+q);

//        element()
        System.out.println("element-> "+q.element());
//        peek()
        System.out.println("peek-> "+q.peek());

//        remove()
        System.out.println("removed-> "+q.remove());
//        poll()
        System.out.println("polled-> "+q.poll());



    }
}
