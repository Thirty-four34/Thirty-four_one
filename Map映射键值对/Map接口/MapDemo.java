package Map�ӿ�;
import java.util.*;
/*
Map���ϣ�˫�м��ϣ���CollectionMap�ӿڣ����м��ϣ��޹�
Mapһ�δ洢��ֵ�ԣ��������� ����֤Ψһ�ԣ�ֵ�����ظ����� ��
ÿ����ֻ�ܶ�Ӧһ��ֵMap<K,V> ����K����Ϊ���Ķ���ķ��� Key,V��Ϊֵ�Ķ���ķ��� Value
 */


/*Map���÷���
    ���Ԫ�أ�put,put�и�����ֵ������ֵ�ǵ��ٴ����ͬһ����ʱ�������֮ǰ��ֵ��
    ��ȡ��Ӧ����ֵ��get
    boolean containsKey(K key)�жϼ�������û����������з���true
    boolean containsValue(V value)�жϼ�����û�������ֵ���з���true
    V remove(K,Key)���ݼ���ɾ�������ֵ�Է���ɾ��֮ǰֵ
    Collection<?> values()��Map�����е�����ֵ���洢��Collection����
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String, Integer>();
        //���Ԫ�أ�put
        map.put("��ʮ��", 34);
        map.put("a", 11);
        map.put("b", 22);
        map.put("e", 55);
        System.out.println(map);
        //��ȡ��Ӧ����ֵ��get
        Integer I=map.get("��ʮ��");
        System.out.println(I);
        //put�и�����ֵ������ֵ�ǵ��ٴ����ͬһ����ʱ�������֮ǰ��ֵ��
        Integer it=map.put("��ʮ��", 87);
        System.out.println("�����ǵ�ֵ��" + it);
        Map<String,Integer> map1=new HashMap<String, Integer>();
        map.put("��ʰ��", 99);
        //��ָ��ӳ���н�����ӳ���ϵ���Ƶ���ӳ����:putAll
        map.putAll(map1);
        System.out.println(map);
        //boolean containsKey(K key)�жϼ�������û�������
        boolean bl=map.containsKey("��ʰ��");
        System.out.println(bl);
        //boolean containsValue(V value)�жϼ�����û�������ֵ
        boolean bl1=map.containsValue(87);
        System.out.println(bl1);
        // V remove(K,Key)���ݼ�ɾ�������ֵ��,����ɾ��֮ǰֵ
        Integer IN = map.remove("��ʰ��");
        System.out.println("��ɾ����ֵ��"+IN);
        System.out.println("ɾ����֮��ļ�ֵ��"+map);
        //Collection<?> values()��Map�����е�����ֵ���洢��Collection����
        Collection<Integer> cl=map.values();
        for (Integer i : cl) {
            System.out.println(i);
        }
    }
}
