package Generics;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List<String> test1 = new ArrayList<String>();

        test1.add("random");
        test1.add("another");

        Iterator<String> itr = test1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
