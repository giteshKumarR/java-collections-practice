package II_Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectionTest {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(5);

        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(5);

        System.out.println("s1.equals(s) = " + st1.equals(st));

        st1.addAll(st);
        System.out.println("st1 = " + st1);
        System.out.println("st1.isEmpty() = " + st1.isEmpty());

        System.out.println("st1.empty() = " + st1.empty());

    }
}
