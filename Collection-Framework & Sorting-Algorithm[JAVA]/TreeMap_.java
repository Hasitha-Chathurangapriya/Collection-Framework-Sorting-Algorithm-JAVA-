import java.util.Map;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Language", "Java");
        treeMap.put("Version", "11");
        System.out.println(treeMap.get("Language"));

    }
}
