package HashMap类;

import 配件.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
HashMap子类自身特性底层数据结构就是哈希表
允许存储nul1值，null键(Map接口不具备的)
是线程不安全的集合，运行速度快
存储到HashMap集合中，用于键的对象，必须实现hashCode和equals方法,保证唯一性
(否则会把键完全相同的多个元素都存储起来)
HashMap案例
    存储自定义对象(Student)，作为键,同时使用keySet entrySet做遍历
 */
public class HashMapDemo {
    public static void main(String[] args) {
        method_1();
    }

    //keySet方法
    public static void method() {
        HashMap<Student, String> hm = new HashMap<Student, String>();
        //存储到HashMap集合中，用于键的对象，必须实现hashCode和equals方法,保证唯一性
        hm.put(new Student("a", 76), "成都");
        hm.put(new Student("b", 54), "攀枝花");
        hm.put(new Student("c", 34), "自贡");
        hm.put(new Student("d", 76), "绵阳");
        Set<Student> set = hm.keySet();
        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            Student ST = it.next();
            System.out.println(ST + "..." + hm.get(ST));
        }
    }
     //entrySet方法
     public static void method_1() {
        HashMap<Student,String> hm = new HashMap<Student,String>();
        //存储到HashMap集合中，用于键的对象，必须实现hashCode和equals方法,保证唯一性
         hm.put(new Student("a", 76), "成都");
         hm.put(new Student("b", 54), "攀枝花");
         hm.put(new Student("b", 54), "hyyv");
         hm.put(new Student("c", 34), "自贡");
         hm.put(new Student("d", 76), "绵阳");
         hm.put(new Student("d", 76), "ksdhf");
         Set<Map.Entry<Student,String>> set = hm.entrySet();
         Iterator<Map.Entry<Student,String>> it = set.iterator();
         while (it.hasNext()) {
             Map.Entry<Student,String> ME = it.next();
             System.out.println(ME.getKey()+"..."+ME.getValue());
         }
    }
}
