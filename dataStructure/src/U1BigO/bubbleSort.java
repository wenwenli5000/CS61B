package U1BigO;

public class bubbleSort {
    public static void main(String[] args) {
        int[] array = {34, 4, 67, 35, 76, 18};
        bubbleSort1(array);
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void bubbleSort1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int e = arr.length - 1; e > 0; e--) {
            for (int i = 0; i < e; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }

            }
        }
    }
    //交换 arr 的i 和 j位置上的值//
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}


