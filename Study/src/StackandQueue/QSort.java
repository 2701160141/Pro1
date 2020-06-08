package StackandQueue;

public class QSort {
    public static void main(String[] args) {
        int[] a = {9, 7, 5, 3, 1, 8, 6, 4, 2, 0};
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        int pivot = 0;
        if (left < right) {
            pivot = partition1(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    private static int partition1(int[] arr, int left, int right) {
        int key = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= key) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= key) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = key;
        return left;
    }
}
