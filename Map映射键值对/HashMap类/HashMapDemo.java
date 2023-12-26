package HashMap��;

import ���.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
HashMap�����������Եײ����ݽṹ���ǹ�ϣ��
����洢nul1ֵ��null��(Map�ӿڲ��߱���)
���̲߳���ȫ�ļ��ϣ������ٶȿ�
�洢��HashMap�����У����ڼ��Ķ��󣬱���ʵ��hashCode��equals����,��֤Ψһ��
(�����Ѽ���ȫ��ͬ�Ķ��Ԫ�ض��洢����)
HashMap����
    �洢�Զ������(Student)����Ϊ��,ͬʱʹ��keySet entrySet������
 */
public class HashMapDemo {
    public static void main(String[] args) {
        method_1();
    }

    //keySet����
    public static void method() {
        HashMap<Student, String> hm = new HashMap<Student, String>();
        //�洢��HashMap�����У����ڼ��Ķ��󣬱���ʵ��hashCode��equals����,��֤Ψһ��
        hm.put(new Student("a", 76), "�ɶ�");
        hm.put(new Student("b", 54), "��֦��");
        hm.put(new Student("c", 34), "�Թ�");
        hm.put(new Student("d", 76), "����");
        Set<Student> set = hm.keySet();
        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            Student ST = it.next();
            System.out.println(ST + "..." + hm.get(ST));
        }
    }
     //entrySet����
     public static void method_1() {
        HashMap<Student,String> hm = new HashMap<Student,String>();
        //�洢��HashMap�����У����ڼ��Ķ��󣬱���ʵ��hashCode��equals����,��֤Ψһ��
         hm.put(new Student("a", 76), "�ɶ�");
         hm.put(new Student("b", 54), "��֦��");
         hm.put(new Student("b", 54), "hyyv");
         hm.put(new Student("c", 34), "�Թ�");
         hm.put(new Student("d", 76), "����");
         hm.put(new Student("d", 76), "ksdhf");
         Set<Map.Entry<Student,String>> set = hm.entrySet();
         Iterator<Map.Entry<Student,String>> it = set.iterator();
         while (it.hasNext()) {
             Map.Entry<Student,String> ME = it.next();
             System.out.println(ME.getKey()+"..."+ME.getValue());
         }
    }
}
