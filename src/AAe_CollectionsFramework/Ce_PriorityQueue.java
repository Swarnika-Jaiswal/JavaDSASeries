package AAe_CollectionsFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ce_PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        //minHeap => Integer-> Less Value-> Less Priority
        //default case meh less integer has the higher priority

        pq.offer(40);
        pq.offer(30);
        pq.offer(20);
        pq.offer(10);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);


       //maxHeap => Integer -> High Value -> High Priority
        Queue<Integer> pq1 = new PriorityQueue<>((a,b)->b-a);

        pq1.offer(1);
        pq1.offer(2);
        pq1.offer(3);
        pq1.offer(4);
        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1);



    }
}
