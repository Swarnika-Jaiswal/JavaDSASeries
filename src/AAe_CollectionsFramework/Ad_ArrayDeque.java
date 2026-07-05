package AAe_CollectionsFramework;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;


public class Ad_ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
//        add()
        q.add(10);
        q.add(20);
        System.out.println("Before "+q);
//        offer()
        q.offer(30);
        System.out.println("After offer "+q);
//        offerFirst()
        q.offerFirst(40);
        System.out.println("After offerFirst "+q);
        q.offerLast(50);
        System.out.println("After offerLast "+q);

//        element()
        System.out.println("element-> "+q.element());
//        peek()
        System.out.println("peek()->display the head element of queue= "+q.peek());
//        peekFirst()
        System.out.println("peekFirst()->display the head element of queue= "+q.peekFirst());
//        peekLast()
        System.out.println("peekLast()->display the head element of queue= "+q.peekLast());


//        remove()
        System.out.println("removed-> "+q.remove());
//        poll()
        System.out.println("polled-> "+q.poll());
//        pollFirst()
        System.out.println("pollFirst() -> removes first element and displays it = " + q.pollFirst());
//        pollLast()
        System.out.println("pollLast()-> removes last element and displays it = " + q.pollLast());



    }
}

