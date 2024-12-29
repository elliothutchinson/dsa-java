package dsa.algorithms.sorting;

public class BubbleSort implements SortDemo {
    @Override
    public void sort(int[] a) {
        for (int i = 0, n = a.length; i < a.length; ++i, --n) {
            boolean swapped = false;
            for (int j = 1; j < n; ++j) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String... args) {
        new BubbleSort().demo();
    }
}
