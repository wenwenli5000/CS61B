package U1BigO;
// 一组数组，已知有两种数出现奇数次，其余数出现偶数次，请找出这两种数
// 异或运算：不进位相加

public class oddNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 2,1, 3, 3,3,1, 1, 1};
        printOddTimesNum2(array);
    }


    public static void printOddTimesNum2(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];

        }
        //eor = a^b
        //eor !=0
        //eor 必然有一个位置上是1
        int rightOne = eor & (~eor + 1); //提取出最右的1

        int onlyOne = 0;// eor'
        for (int cur : arr) {
            if ((cur & rightOne) == 1) {
                onlyOne ^= cur;
            }
        }
        System.out.println(onlyOne +" " +eor+" " + (eor ^ onlyOne));

    }
}

