package III_ComparableAndComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingTest {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(13,52,1,3,62,69);
        Collections.sort(values);
        System.out.println("values(Ascending Order) = " + values);

        Collections.sort(values,(Integer a, Integer b) -> b-a);
//        values.sort((Integer a, Integer b) -> b-a);
        System.out.println("values(Descending Order) = " + values);
    }
}
