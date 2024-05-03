import java.util.Stack;

public class Stacks_ {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hellow");
        stack.push("Java");
        stack.push("World");

        System.out.println(stack.pop());
    }
}
