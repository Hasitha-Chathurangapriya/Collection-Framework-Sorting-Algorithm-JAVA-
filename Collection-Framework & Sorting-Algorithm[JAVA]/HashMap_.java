import java.util.HashMap;
import java.util.Map;

public class HashMap_ {
    public static void main(String[] args){
        Map<String, String> hasMap = new HashMap<>();

        hasMap.put("Language", "Java");
        hasMap.put("Version", "11");

        System.out.println(hasMap.get("Language"));
    }
}