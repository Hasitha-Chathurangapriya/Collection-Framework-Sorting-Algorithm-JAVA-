package ListInterface;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args){
        LinkedList<String> student = new LinkedList<String>();

        student.add("Hasitha");
        student.add("NImal");
        student.add("Kamala");
        student.add("Amith");
        student.add("Amith");

        System.out.println(student);
    }
}
