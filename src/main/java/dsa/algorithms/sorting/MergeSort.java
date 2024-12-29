package dsa.algorithms.sorting;

public class MergeSort implements SortDemo {
    @Override
    public void sort(int[] a) {
        if (a.length < 2) {
            return;
        }
        int mid = a.length / 2;
        int[] left = new int[mid];
        int[] right = new int[a.length - mid];
        for (int i = 0; i < mid; ++i) {
            left[i] = a[i];
        }
        for (int i = mid; i < a.length; ++i) {
            right[i - mid] = a[i];
        }
        sort(left);
        sort(right);
        merge(left, right, a);
    }

    private void merge(int[] left, int[] right, int[] a) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            a[k++] = left[i] < right[j] ? left[i++] : right[j++];
        }
        while (i < left.length) {
            a[k++] = left[i++];
        }
        while (j < right.length) {
            a[k++] = right[j++];
        }
    }

    public static void main(String... args) {
        new MergeSort().demo();
    }
}
