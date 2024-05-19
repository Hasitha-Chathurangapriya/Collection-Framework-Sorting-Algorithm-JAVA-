package MapInterface;

import java.util.Map;
import java.util.TreeMap;

public class Tree {
    public static void main(String[] args){
        TreeMap<Integer,String> map = new TreeMap<Integer, String>();

        map.put(500,"Hasitha");
        map.put(502,"Kamla");
        map.put(504,"Nimal");
        map.put(503,"Viraj");
        map.put(500,"kamala");

        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+ m.getValue());
        }

    }
}
