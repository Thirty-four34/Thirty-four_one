package Map���ϱ�����ʽ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map���ϵ�ȡ����ʽ
    Map���ϴ洢���Ǽ�ֵ�ԣ�һ����ӳ��һ��ֵ ���޹�ϵ
    ��һ����������ӳ���ϵ��(���֤)
    ��ֵ�Թ�ϵ����������ӿڣ��ӿ���Map�ӿ��е��ڲ��ӿ�
interface Map{
    interface Entry{
       K getKey();
       getValue();
     }
}
����ʹ�õ���HashMapʵ��
class HashMap implements Map{
    public map.Entry entrySet(){
        return new Entry();
    class Entry implements Map.Entry{
        public K getKey(){}
        public V getValue(){}
        }
    }
}

ʵ�ֲ���
1��Map�����еķ��� entrySet()��ȡ��ֵ�Թ�ϵ���� Map,Entry�ӿڵ�ʵ���ཫMap.Entry�ӿ�ʵ������󣬴洢��Set����
Set< Map.Entry<String,Integer>> set = map.entrySet();
2��ѡ��Set����
3����ȡSet�����У��洢����ʲô?��Map.Entry��ʵ������� Map�����м�ֵ��ӳ���ϵ
4��ʹ�÷��ص�Map.Entry���󷽷� getKey getValue��ȡ��ֵ��

 */
public class ��ʽ��__entrySet {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String, Integer>();
        map.put("��ʮ��", 34);
        map.put("a", 11);
        map.put("b", 22);
        map.put("e", 55);
        map.put("��ʰ��", 98);
        Set<Map.Entry<String,Integer>> set=map.entrySet();
        Iterator<Map.Entry<String,Integer>> it=set.iterator();
        while (it.hasNext()) {//set�����е�Ԫ����Map.Entry�ӿڵ�ʵ�������
            Map.Entry me= it.next();
            System.out.println(me.getKey()+"..."+me.getValue());
        }
    }
}
