package Map���ϱ�����ʽ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map���ϻ�ȡ��ʽ���ǽ���Map���ϵ�����ȡ����������Set����
ʵ�ֲ���:
1������Map���ϵķ���Set <K> keySet()����:��Map�е����еļ����洢��Set����
2��ѡ��Set���ϻ�ȡ������Set�е�Ԫ�أ���ЩԪ����Map�еļ�
3������Map�����е�get������ͨ������ȡֵ
 */
public class ��ʽһ__keySet {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String, Integer>();
        map.put("��ʮ��", 34);
        map.put("a", 11);
        map.put("b", 22);
        map.put("e", 55);
        map.put("��ʰ��", 98);
        Set<String> set = map.keySet();
        //��ʽһ��������
        Iterator<String> it=set.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str+"..."+map.get(str));
        }
        System.out.println("---------------------");
        //��ʽ������ǿfor
        for (String str : set) {
            System.out.println(str+"..."+map.get(str));
        }
    }
}
