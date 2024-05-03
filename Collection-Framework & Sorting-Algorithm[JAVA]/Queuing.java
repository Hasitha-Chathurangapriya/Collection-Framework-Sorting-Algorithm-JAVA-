import java.util.LinkedList;
import java.util.Queue;

public class Queuing {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Hello");
        queue.add("Java");
        queue.add("World");

        System.out.println(queue.poll());
    }
}