package U2;

public class smallSum {

    //与逆序对问题等效
    public static int process(int[] arr, int L, int R) {
        if (L == R) {
            return 0;
        }
        int mid = L + ((R - L) >> 1);
        return process(arr, L, mid) +
        process(arr, mid + 1, R)+
        merge(arr, L, mid, R);

    }
    public static int merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        int res =0;
        while (p1 <= M && p2 <= R) {
            res += arr[p1] < arr[p2] ? (R-p2 +1 )* arr[p1]:0; // 当前右组的数有多少个比左组的数大：个数
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];//与mergesort不一样的地方在于，此时要copy右组
        }
        while (p1 <= M) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[i +L] = help[i];
        }
        return res;


    }
}
