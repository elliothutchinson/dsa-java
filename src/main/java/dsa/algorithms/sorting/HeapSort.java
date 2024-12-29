package dsa.algorithms.sorting;

public class HeapSort implements SortDemo {
    @Override
    public void sort(int[] a) {
        heapify(a);
        heapSort(a);
    }

    private void heapify(int[] a) {
        for (int i = 1; i < a.length; ++i) {
            siftUp(a, i);
        }
    }

    private void heapSort(int[] a) {
        for (int i = a.length - 1; i > 0; --i) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            siftDown(a, i);
        }
    }

    private void siftUp(int[] a, int end) {
        int child = end;
        int parent = (end - 1) / 2;
        while (parent >= 0 && a[child] > a[parent]) {
            int temp = a[parent];
            a[parent] = a[child];
            a[child] = temp;
            child = parent;
            parent = (child - 1) / 2;
        }
    }

    private void siftDown(int[] a, int end) {
        int parent = 0;
        int leftChild = parent * 2 + 1;
        int rightChild = leftChild + 1;
        while (leftChild < end) {
            int largerChild = (rightChild >= end || a[leftChild] >= a[rightChild]) ? leftChild : rightChild;

            if (a[parent] < a[largerChild]) {
                int temp = a[parent];
                a[parent] = a[largerChild];
                a[largerChild] = temp;
            } else {
                break;
            }

            parent = largerChild;
            leftChild = parent * 2 + 1;
            rightChild = leftChild + 1;
        }
    }

    public static void main(String... args) {
        new HeapSort().demo();
    }
}
