package dsa.algorithms.sorting;

import java.util.Arrays;

public interface SortDemo extends Sort {
    default void demo() {
        System.out.println("start");

        int[] a = {1, 10, 9, 4};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println("end");
    }
}
