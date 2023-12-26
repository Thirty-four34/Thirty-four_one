package Collections工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 叁拾肆
 * 2022/11/20 10:12:07
 **/


/*
static <T> binarySearch 集合折半查找
void reverse 集合反转
void shuffle 对集合随机排列
synchronized开头的XXX方法
    将线程不安全的集合，变成线程家全集合。实际开发用集合就使用不安全的
 */
public class 其他方法 {
    public static void main(String[] args) {
        method_2();
    }

    /*
       static <T> binarySearch 集合折半查找对List进行折半查找，
        集合必须有序排列，返回元素所在的索引没有找到返回 (-插入点-1)
     */
    public static void method() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(98);
        list.add(374);
        list.add(254);
        list.add(12);
        list.add(65);
        list.add(34);
        //先对集合进行排序
        Collections.sort(list);
        //集合折半查找对List进行折半查找
        int num=Collections.binarySearch(list,65);
        System.out.println(num);
        //如果不存在该元素，则返回元素所在的索引没有找到返回 (-插入点-1)
         num=Collections.binarySearch(list,234);
        System.out.println(num);
    }

    //reverse 集合反转
    public static void method_1() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(98);
        list.add(374);
        list.add(254);
        list.add(12);
        list.add(65);
        list.add(34);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }

    //shuffle 对集合随机排列
    public static void method_2() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(98);
        list.add(374);
        list.add(254);
        list.add(12);
        list.add(65);
        list.add(34);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }

}
