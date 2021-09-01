import java.util.LinkedList;

import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");

        System.out.println(queue);
        //first in first out
        System.out.println(queue.remove());
        System.out.println(queue);
        //peek at first element, don't remove
        System.out.println(queue.peek());
        System.out.println(queue);

    }
}
