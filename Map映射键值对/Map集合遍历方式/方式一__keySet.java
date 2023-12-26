package Map集合遍历方式;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合获取方式凡是进行Map集合迭代获取，必须依赖Set集合
实现步骤:
1。调用Map集合的方法Set <K> keySet()作用:将Map中的所有的键，存储到Set集合
2。选代Set集合获取到的是Set中的元素，这些元素是Map中的键
3。调用Map集合中的get方法，通过键获取值
 */
public class 方式一__keySet {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String, Integer>();
        map.put("三十四", 34);
        map.put("a", 11);
        map.put("b", 22);
        map.put("e", 55);
        map.put("叁拾肆", 98);
        Set<String> set = map.keySet();
        //方式一：迭代器
        Iterator<String> it=set.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str+"..."+map.get(str));
        }
        System.out.println("---------------------");
        //方式二：增强for
        for (String str : set) {
            System.out.println(str+"..."+map.get(str));
        }
    }
}
