package I_Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        System.out.println("values(before) = " + values);


        // 1. Iterating using iterator
        Iterator itr = values.iterator();

        while(itr.hasNext()) {
            int val = (int) itr.next();
            System.out.println("val = " + val);
            if(val == 3) {
                itr.remove();
            }
        }
        System.out.println("values(after) = " + values);

        // 2. Iterating using forEach()
        values.forEach(System.out::println);
    }
}
