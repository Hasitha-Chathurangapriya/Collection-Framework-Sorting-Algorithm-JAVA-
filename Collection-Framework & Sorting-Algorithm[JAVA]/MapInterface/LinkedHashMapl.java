package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapl {
    public static void main(String[] args){

        LinkedHashMap<Integer,String> hr = new LinkedHashMap<Integer,String>();

        hr.put(500,"Kamal");
        hr.put(501,"Nimal");
        hr.put(502,"Rammal");

        for(Map.Entry m:hr.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
