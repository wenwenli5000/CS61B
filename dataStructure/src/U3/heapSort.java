package U3;

import java.net.BindException;
//堆排序：1）把数组变成大根堆。。
//不满足稳定性

public class heapSort {
    public static void heapSort (int[] arr) {
        if (arr==null || arr.length<2) {
            return;
        }
        for (int i=0; i< arr.length;i++) { //O (N)
            heapInsert (arr,i);// O(log N)
        }

        //for( int i=arr.length-1;i>=0;i--) {
           // heapify(arr,i, arr.length);
        //} 假设数组的数都已经给好了，从右往左 往下也是大根堆

        int heapSize = arr.length;
        swap(arr,0,--heapSize);
        while (heapSize >0 ){//O (N)
            heapify(arr,0,heapSize);//O (logN)
            swap(arr,0,--heapSize);//O (1)
        }
    }

    //某个数现在处在index的位置，往上继续移动=> 得到大根堆
    public static void heapInsert (int[] arr, int index) {
        while (arr[index]> arr [(index-1)/2]){
            swap(arr,index,(index-1)/2);
            index=(index-1)/2;

        }

    }
    //这是从上往下的方法，堆化的过程。从任何位置开始都可以，得到大根堆。
    public static void heapify(int [] arr, int index, int heapSize) {
        int left= 2*index +1;// 左孩子的下标

        while (left < heapSize) {//下方还有孩子的时候， 判断左孩子是否越。
            // 因为左孩子下标比右孩子小，左孩子不越界，就有孩子；左孩子越界，没有左孩子，就意味着也没有右孩子。

            // 两个孩子中，谁的值大，把下标给largest
            int largest = left +1 < heapSize && arr[left+1] >arr[left] ? left +1 : left;

            //父和较大的孩子之间，谁的值大，把下标给largest
            largest = arr[largest] > arr[index] ? largest:index;
            if (largest == index) {
                break;
            }
            swap(arr,largest,index);
            index=largest;
            left=2*index+1;
        }
    }
   public static void swap (int [] arr, int i,int j) {
        int tmp =arr[i];
        arr[i]= arr[j];
        arr[j]= tmp;
   }

}
