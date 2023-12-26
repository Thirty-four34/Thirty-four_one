package TreeMap��;
import ���.Student;

import java.util.*;

/*
TreeMap�����ص�
�Դ洢�������еļ��������򣬲����ֵ�ײ�ṹ�����
Ҫ���Ǵ洢�ļ����󣬱���ӵ����Ȼ˳�򣬻���ָ���Ƚ����̲߳���ȫ�������ٶȿ�
 */

//�Զ���Ƚ�������
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
    //��Ȼ����,�Ȱ������Ƚϣ�������ͬ������Ƚ�
    public static void method() {
        TreeMap<Student, String> TM = new TreeMap<Student,String>();
        TM.put(new Student("a", 76), "�ɶ�");
        TM.put(new Student("a", 99), "����");
        TM.put(new Student("a", 99), "ojls");//����ԭ������ֵ
        TM.put(new Student("e", 54), "��֦��");
        TM.put(new Student("c", 34), "�Թ�");
        TM.put(new Student("f", 76), "����");
        Set<Map.Entry<Student,String>> set=TM.entrySet();
        Iterator<Map.Entry<Student,String>> it=set.iterator();
        while (it.hasNext()) {
            Map.Entry<Student,String> me= it.next();
            System.out.println(me.getKey()+"..."+me.getValue());
        }
    }
    //�Զ���Ƚ��������Ȱ�����Ƚϣ�������ͬ�������Ƚ�
    public static void method_1() {
        TreeMap<Student, String> TM = new TreeMap<Student,String>(new MyComparable());
        TM.put(new Student("a", 76), "�ɶ�");
        TM.put(new Student("a", 99), "����");
        TM.put(new Student("e", 54), "��֦��");
        TM.put(new Student("c", 34), "�Թ�");
        TM.put(new Student("f", 76), "����");
        Set<Map.Entry<Student,String>> set=TM.entrySet();
        Iterator<Map.Entry<Student,String>> it=set.iterator();
        while (it.hasNext()) {
            Map.Entry<Student,String> me= it.next();
            System.out.println(me.getKey()+"..."+me.getValue());
        }
    }
}
