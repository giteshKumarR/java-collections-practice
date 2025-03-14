package IV_Deque;

import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class DequeTest {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();
        arrayDequeAsQueue.addFirst(1);
        arrayDequeAsQueue.addFirst(5);
        arrayDequeAsQueue.addFirst(3);
        System.out.println("arrayDequeAsQueue = " + arrayDequeAsQueue);

        PriorityBlockingQueue<Integer> dq = new PriorityBlockingQueue<>(); // Min heap
        dq.addAll(arrayDequeAsQueue);
        System.out.println("dq = " + dq);

        ConcurrentLinkedDeque<Integer> cdq = new ConcurrentLinkedDeque<>();
        cdq.addAll(dq);
        System.out.println("cdq = " + cdq);
    }
}
