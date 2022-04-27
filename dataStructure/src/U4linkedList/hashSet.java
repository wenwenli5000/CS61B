package U4linkedList;

import javax.xml.soap.Node;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class hashSet {
    public static void Node() {
        //

    }

    public static void main(String[] args) {
        //key-value
        //hashSet1的key是基础类型- > int 类型, 内部按值传递，内存占用这个东西的大小
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(3);
        System.out.println(hashSet1.contains(3));
        hashSet1.remove(3);
        System.out.println(hashSet1.contains(3));
        //key
        HashMap<Integer, String> mapTest = new HashMap<>();
        mapTest.put(1, "zuo");
        mapTest.put(1, "cheng");//updata
        mapTest.put(2, "222");
        System.out.println(mapTest.containsKey(1));
        System.out.println(mapTest.get(1));
        System.out.println(mapTest.get(4));

        mapTest.remove(2);
        System.out.println(mapTest.get(2));

        // hashSet2的key是非基础类型-> Node 类型： 内存传递按引用传递（按地址），内存占用这个东西内存地址的大小
       // nodeA = new Node(1);
        //Node<> =

        // 展示有序表常用操作,有序表在使用层面上可以理解为一种集合结构
        TreeMap<Integer, String> treeMap1 = new TreeMap<>();
        treeMap1.put(7, "i am 7");
        treeMap1.put(5, "i am 5");
        treeMap1.put(4, "i am 4");
        treeMap1.put(3, "i am 3");
        treeMap1.put(9, "i am 9");
        treeMap1.put(2, "i am 2");

        System.out.println(treeMap1.containsKey(5));
        System.out.println(treeMap1.get(5));
        System.out.println(treeMap1.firstKey() + ",i am the smallest");
        System.out.println(treeMap1.lastKey() + ",i am the largest");
        System.out.println(treeMap1.floorKey(8) + ",在表中所有<=8的数中，我离8最近");
        System.out.println(treeMap1.ceilingKey(8) + ",在表中所有>=8的数中，我离8最近");
        treeMap1.remove(5);
        System.out.println(treeMap1.get(5) + ",删了就没有了");


    }
}
