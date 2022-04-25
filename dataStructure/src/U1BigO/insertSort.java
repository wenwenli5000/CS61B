package U1BigO;
//插入排序：倒序冒泡排序

public class insertSort {
    public static void main(String[] args) {
        int[] array = {34, 4, 67, 35, 76, 18};
        insertSort1(array);
        for (int element : array) {
            System.out.println(element);
        }
    }

        //0~0 有序的
        //0·i 想有序
    public static void insertSort1 ( int[] arr) { //0～i 做到有序
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {// j 来到了 i-1 位置

            }
        }

    }
    // i 和 j 是一个位置的话，会出错
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

//    //for test
//    public static void comparator (int[] arr) {
//        Arrays.sort(arr);
//    }
//    //for test
}
