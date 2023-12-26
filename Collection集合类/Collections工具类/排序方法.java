package Collections工具类;

import java.util.*;
import 配件.Student;

/**
 * @author 叁拾肆
 * @date 2022/11/19 23:34
 **/

/*
Collections工具类只对List进行排序
 */


    //根据字符串的长度排序的比较器
class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int num = o1.getName().length() - o2.getName().length();
        return num==0?o1.getName().compareTo(o2.getName()):num;
    }
}
public class 排序方法 {
    public static void main(String[] args) {
        System.out.println("---------sort自然顺序排序-----------");
        method();
        method_1();//排序自定义对象
        System.out.println("-----------sort比较器排序---------");
        method_2();
        System.out.println("-----------reverseOrder自然顺序逆转排序---------");
        method_3();
        System.out.println("-----------reverseOrder比较器逆转排序---------");
        method_4();
    }
//void Collections.sort(List<T> list) 根据元素的自然顺序 对指定列表按升序进行排序。
    public static void method() {
       List<String> list = new ArrayList<String>();
        list.add("fhsf");
        list.add("ljm");
        list.add("uteri");
        list.add("dsx");
        list.add("a");
        System.out.println(list);
        //排序
        Collections.sort(list);
        System.out.println(list);
    }
    //排序自定义对象时，该对象的类必须得有实现comparaTo(自然顺序)方法
    public static void method_1() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("fhsf",87));
        list.add(new Student("kom",546));
        list.add(new Student("cx",980));
        list.add(new Student("zf",12));
        list.add(new Student("w",454));
        System.out.println(list);
        //排序
        Collections.sort(list);
        System.out.println(list);
    }
    //void sort(List<T> list, Comparator<? super T> c) 根据指定比较器产生的顺序对指定列表进行排序。
    public static void method_2() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("fhsf",87));
        list.add(new Student("kom",546));
        list.add(new Student("cx",980));
        list.add(new Student("zf",12));
        list.add(new Student("w",454));
        System.out.println(list);
        //排序
        Collections.sort(list,new MyComparator());
        System.out.println(list);
    }
    /*
        static <T> Comparator<T> reverseOrder()
        返回一个比较器，它强行逆转实现了 Comparable 接口的对象 collection 的自然顺序。
     */
    public static void method_3() {
        List<String> list = new ArrayList<String>();
        list.add("fhsf");
        list.add("ljm");
        list.add("uteri");
        list.add("dsx");
        list.add("a");
        System.out.println(list);
        //排序
        Comparator c = Collections.reverseOrder();
        Collections.sort(list,c);
        System.out.println(list);
    }
    public static void method_4() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("fhsf",87));
        list.add(new Student("kom",546));
        list.add(new Student("cx",980));
        list.add(new Student("zf",12));
        list.add(new Student("w",454));
        System.out.println(list);
        //排序
        Comparator c = Collections.reverseOrder(new MyComparator());
        Collections.sort(list,c);
        System.out.println(list);
    }
}
