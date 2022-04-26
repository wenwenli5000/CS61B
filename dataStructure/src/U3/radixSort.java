package U3;

public class radixSort {
    //不基于比较的排序要基于数据状况,基数排序：最大的数字有n位，把长度不到n的数字左边补0补齐位数，准备bucket
    //从个位开始排，随高位依次进桶出桶-FIFO。 又名bucketSort
    public static void radixSort(int[] arr, int L, int R, int digit) {//digit 表示最大值有个十进制的数，即有多少位
        final int radix = 10;
        int i = 0, j = 0;
        //有多少个数准备多少个辅助空间
        int[] bucket = new int[R - L + 1];
        for (int d = 1; d <= digit; d++) { //有多少位就进出多少次
            // 10个空间
            //count[0] 当前位(d位)是0的数字有多少个
            //count[1] 当前位(d位)（0和1）的数字有多少个
            //count[2] 当前位(d位)是（0、1、2）的数字有多少个
            //count[i] 当前位(d位) 是（0～i）的数字有多少个
            //count 数组此时成为了每组某位相同的数最后一个数在help数组中index的记录
            //help[-- count [arr[i]的某位]]=arr[i]
            int[] count = new int[radix];//count[0...9]
            for (i = L; i <= R; i++) {
                j = getDigit(arr[i], d);// 一个数字取出某位的数，i=0： 取个位； i=1： 取百位
                count[j]++;
            }

            for (i = 1; i < radix; i++) {
                count[i] += count[i - 1];

            }
            ////从右往左，相当于先入桶的先出桶
            for (i = R; i >= L; i--) {
                j = getDigit(arr[i], d);
                bucket[count[j] - 1] = arr[i];//放到辅助的数组里
                count[j]--;
            }
            for (i = L, j = 0; i <= R; i++, j++) {
                arr[i] = bucket[j];
            }

        }
    }

    public static int getDigit(int x, int d) {
        return ((x / ((int) Math.pow(10, d - 1))) % 10);
    }
}
