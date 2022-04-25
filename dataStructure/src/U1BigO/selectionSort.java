package U1BigO;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] array = {14, 544, 3, 9, 8};
        selectionSort1(array);
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void selectionSort1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {//i~N -1
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) { // i~N-1 上找最小值的下标
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }
}
