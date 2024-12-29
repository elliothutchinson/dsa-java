package dsa.algorithms.sorting;

public class InsertionSort implements SortDemo {
    @Override
    public void sort(int[] a) {
        for (int i = 1; i < a.length; ++i) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j--];
            }
            a[j + 1] = temp;
        }
    }

    public static void main(String... args) {
        new InsertionSort().demo();
    }
}
