import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
    public static void main(String[] args) {
        Queue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("Hello");
        priorityQueue.add("Java");
        priorityQueue.add("World");

        System.out.println(priorityQueue.poll());
    }
}
