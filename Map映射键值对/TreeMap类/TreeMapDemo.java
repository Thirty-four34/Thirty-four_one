package TreeMap类;
import 配件.Student;

import java.util.*;

/*
TreeMap自身特点
对存储到集合中的键进行排序，不理会值底层结构红黑树
要求是存储的键对象，必须拥有自然顺序，或者指定比较器线程不安全，运行速度快
 */

//自定义比较器的类
class MyComparable implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int num=o1.getAge()-o2.getAge();
        return num==0?o1.getName().compareTo(o2.getName()):num;
    }
}


public class TreeMapDemo {
    public static void main(String[] args) {
        method();
        System.out.println("------------------");
        method_1();
    }
    //自然排序,先按姓名比较，姓名相同按年龄比较
    public static void method() {
        TreeMap<Student, String> TM = new TreeMap<Student,String>();
        TM.put(new Student("a", 76), "成都");
        TM.put(new Student("a", 99), "重庆");
        TM.put(new Student("a", 99), "ojls");//覆盖原来键的值
        TM.put(new Student("e", 54), "攀枝花");
        TM.put(new Student("c", 34), "自贡");
        TM.put(new Student("f", 76), "绵阳");
        Set<Map.Entry<Student,String>> set=TM.entrySet();
        Iterator<Map.Entry<Student,String>> it=set.iterator();
        while (it.hasNext()) {
            Map.Entry<Student,String> me= it.next();
            System.out.println(me.getKey()+"..."+me.getValue());
        }
    }
    //自定义比较器排序，先按年龄比较，年龄相同按姓名比较
    public static void method_1() {
        TreeMap<Student, String> TM = new TreeMap<Student,String>(new MyComparable());
        TM.put(new Student("a", 76), "成都");
        TM.put(new Student("a", 99), "重庆");
        TM.put(new Student("e", 54), "攀枝花");
        TM.put(new Student("c", 34), "自贡");
        TM.put(new Student("f", 76), "绵阳");
        Set<Map.Entry<Student,String>> set=TM.entrySet();
        Iterator<Map.Entry<Student,String>> it=set.iterator();
        while (it.hasNext()) {
            Map.Entry<Student,String> me= it.next();
            System.out.println(me.getKey()+"..."+me.getValue());
        }
    }
}
