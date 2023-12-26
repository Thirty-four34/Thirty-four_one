package 数组转集合;

import java.util.*;

/**
 * @author 叁拾肆
 * @date 2022/11/19 19:13
 **/
/*
数组转成集合
    Arrays类静态方法 asList将数组变成集合，固定长度,转换成的集合只能修改不能增删
    集合转数组 toArray()->Collection接口
注：基本类型的数组不能转换为集合，因为集合不存储基本类型
 */
public class ArraysDemo {
    public static void main(String[] args) {
        String[] str = {"a", "jkdhfa", "sdfjks", "iet", "39048", "ifa"};
        List<String> al = Arrays.asList(str);
        //修改值
        al.set(1, "叁拾肆");
        System.out.println(al);

        //集合转数组
        String[] s=al.toArray(new String[0]);
        for (String st : s) {
            System.out.print(st+" ");
        }
        System.out.println();

        //基本类型转换为集合会出现不报错的错误(得到的元素是数组的哈希值)
        int[] num = {4, 5, 2, 8, 54, 76, 234};
        List li = Arrays.asList(num);
        System.out.println(li);
        System.out.println(li.size());
    }
}
