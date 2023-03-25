package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static java.util.List.*;

public class SortTest {
    public static void main(String[] args) {
        List list = of(12,13,14);
        List<Integer> integers = new ArrayList<Integer>();
        //List.of(1,2,3,4);
        integers.add(12);
        integers.add(10);
        integers.add(8);
        integers.add(7);
        integers.add(15);
        integers.add(65);

        Collections.sort(integers);
        //Collections.reverse(integers);
        System.out.println(integers);

        Comparator comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };

        Collections.sort(integers,comparator);
        Collections.sort(integers,Collections.reverseOrder(comparator));
        System.out.println(integers);

        integers.sort(comparator);
        System.out.println(integers);
    }
}
