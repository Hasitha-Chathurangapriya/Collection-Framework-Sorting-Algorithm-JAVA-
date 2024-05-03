import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Hello");
        hashSet.add("Java");
        hashSet.add("Java");

        System.out.println(hashSet);
    }
}
