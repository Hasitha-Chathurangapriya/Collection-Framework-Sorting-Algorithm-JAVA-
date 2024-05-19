package ListInterface;

import java.util.Vector;

public class vector {
    public static void main(String[] args){
        Vector<String> vec = new Vector<String>();

        vec.add("Hasitha");
        vec.add("kamal");
        vec.add("chathuni");
        vec.add("Amila");
        vec.add("Amila");

        vec.addElement("Nimal");
        vec.addElement("shantha");
        vec.addElement("nimala");

        System.out.println("Elements are : "+vec);
    }
}
