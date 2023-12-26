package Map集合遍历方式;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合的取出方式
    Map集合存储的是键值对，一个键映射一个值 夫妻关系
    有一个对象，描述映射关系的(结婚证)
    键值对关系对象的描述接口，接口是Map接口中的内部接口
interface Map{
    interface Entry{
       K getKey();
       getValue();
     }
}
案例使用的是HashMap实现
class HashMap implements Map{
    public map.Entry entrySet(){
        return new Entry();
    class Entry implements Map.Entry{
        public K getKey(){}
        public V getValue(){}
        }
    }
}

实现步骤
1。Map集合中的方法 entrySet()获取键值对关系对象 Map,Entry接口的实现类将Map.Entry接口实现类对象，存储到Set集合
Set< Map.Entry<String,Integer>> set = map.entrySet();
2。选代Set集合
3。获取Set集合中，存储的是什么?是Map.Entry的实现类对象 Map集合中键值对映射关系
4。使用返回的Map.Entry对象方法 getKey getValue获取键值对

 */
public class 方式二__entrySet {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String, Integer>();
        map.put("三十四", 34);
        map.put("a", 11);
        map.put("b", 22);
        map.put("e", 55);
        map.put("叁拾肆", 98);
        Set<Map.Entry<String,Integer>> set=map.entrySet();
        Iterator<Map.Entry<String,Integer>> it=set.iterator();
        while (it.hasNext()) {//set集合中的元素是Map.Entry接口的实现类对象
            Map.Entry me= it.next();
            System.out.println(me.getKey()+"..."+me.getValue());
        }
    }
}
