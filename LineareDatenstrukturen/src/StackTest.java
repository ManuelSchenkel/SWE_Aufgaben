import java.util.Deque;
import java.util.LinkedList;

public class StackTest {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

        stack.push("x");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.peekFirst());
        System.out.println(stack.peekLast());

        System.out.println(stack.remove());
        stack.add("y");
        System.out.println(stack);
    }
}
