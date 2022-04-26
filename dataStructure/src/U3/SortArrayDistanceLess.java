package U3;
//已经一个几乎有序的数组，几乎有序是指，如果把数组排好顺序的话，每个元素移动的距离可以不超过k,并且k相对与数组来说比较小，请选择一个合适的
//排序算法针对这个数据进行排序。O(n *log k)

import java.util.PriorityQueue;

public class SortArrayDistanceLess {

    public void SortArrayDistanceLessK (int[] arr, int k) {
        //默认小根堆
        PriorityQueue< Integer> heap = new PriorityQueue<>();

        for (int index =0; index < Math.min(arr.length,k);index ++) {
            heap.add(arr[index]);
    }
        int i=0;
        for (int index= 0; index< arr.length;i++,index++){
            heap.add(arr[index]);
            arr[i] = heap.poll();
        }
        while (! heap.isEmpty()) {
            arr [i++] = heap.poll();
        }
    }


    public static void main (String[] args) {
        PriorityQueue< Integer> heap = new PriorityQueue<>();// 小根堆

    }

    
}
