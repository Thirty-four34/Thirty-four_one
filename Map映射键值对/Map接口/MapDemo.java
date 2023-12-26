package Map接口;
import java.util.*;
/*
Map集合（双列集合）与CollectionMap接口（单列集合）无关
Map一次存储键值对，两个对象 键保证唯一性，值可以重复集合 。
每个键只能对应一个值Map<K,V> 泛型K，作为键的对象的泛型 Key,V作为值的对象的泛型 Value
 */


/*Map常用方法
    添加元素：put,put有个返回值，返回值是当再次添加同一个键时，这个键之前的值。
    获取对应键的值：get
    boolean containsKey(K key)判断集合中有没有这个键，有返回true
    boolean containsValue(V value)判断集合中没有有这个值，有返回true
    V remove(K,Key)根据键，删除这组键值对返回删除之前值
    Collection<?> values()将Map集合中的所有值，存储到Collection集合
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String, Integer>();
        //添加元素：put
        map.put("三十四", 34);
        map.put("a", 11);
        map.put("b", 22);
        map.put("e", 55);
        System.out.println(map);
        //获取对应键的值：get
        Integer I=map.get("三十四");
        System.out.println(I);
        //put有个返回值，返回值是当再次添加同一个键时，这个键之前的值。
        Integer it=map.put("三十四", 87);
        System.out.println("被覆盖的值是" + it);
        Map<String,Integer> map1=new HashMap<String, Integer>();
        map.put("叁拾肆", 99);
        //从指定映射中将所有映射关系复制到此映射中:putAll
        map.putAll(map1);
        System.out.println(map);
        //boolean containsKey(K key)判断集合中有没有这个键
        boolean bl=map.containsKey("叁拾肆");
        System.out.println(bl);
        //boolean containsValue(V value)判断集合中没有有这个值
        boolean bl1=map.containsValue(87);
        System.out.println(bl1);
        // V remove(K,Key)根据键删除这组键值对,返回删除之前值
        Integer IN = map.remove("叁拾肆");
        System.out.println("被删除的值是"+IN);
        System.out.println("删除完之后的键值对"+map);
        //Collection<?> values()将Map集合中的所有值，存储到Collection集合
        Collection<Integer> cl=map.values();
        for (Integer i : cl) {
            System.out.println(i);
        }
    }
}
