package Collections������;

import java.util.*;
import ���.Student;

/**
 * @author ��ʰ��
 * @date 2022/11/19 23:34
 **/

/*
Collections������ֻ��List��������
 */


    //�����ַ����ĳ�������ıȽ���
class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int num = o1.getName().length() - o2.getName().length();
        return num==0?o1.getName().compareTo(o2.getName()):num;
    }
}
public class ���򷽷� {
    public static void main(String[] args) {
        System.out.println("---------sort��Ȼ˳������-----------");
        method();
        method_1();//�����Զ������
        System.out.println("-----------sort�Ƚ�������---------");
        method_2();
        System.out.println("-----------reverseOrder��Ȼ˳����ת����---------");
        method_3();
        System.out.println("-----------reverseOrder�Ƚ�����ת����---------");
        method_4();
    }
//void Collections.sort(List<T> list) ����Ԫ�ص���Ȼ˳�� ��ָ���б������������
    public static void method() {
       List<String> list = new ArrayList<String>();
        list.add("fhsf");
        list.add("ljm");
        list.add("uteri");
        list.add("dsx");
        list.add("a");
        System.out.println(list);
        //����
        Collections.sort(list);
        System.out.println(list);
    }
    //�����Զ������ʱ���ö������������ʵ��comparaTo(��Ȼ˳��)����
    public static void method_1() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("fhsf",87));
        list.add(new Student("kom",546));
        list.add(new Student("cx",980));
        list.add(new Student("zf",12));
        list.add(new Student("w",454));
        System.out.println(list);
        //����
        Collections.sort(list);
        System.out.println(list);
    }
    //void sort(List<T> list, Comparator<? super T> c) ����ָ���Ƚ���������˳���ָ���б��������
    public static void method_2() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("fhsf",87));
        list.add(new Student("kom",546));
        list.add(new Student("cx",980));
        list.add(new Student("zf",12));
        list.add(new Student("w",454));
        System.out.println(list);
        //����
        Collections.sort(list,new MyComparator());
        System.out.println(list);
    }
    /*
        static <T> Comparator<T> reverseOrder()
        ����һ���Ƚ�������ǿ����תʵ���� Comparable �ӿڵĶ��� collection ����Ȼ˳��
     */
    public static void method_3() {
        List<String> list = new ArrayList<String>();
        list.add("fhsf");
        list.add("ljm");
        list.add("uteri");
        list.add("dsx");
        list.add("a");
        System.out.println(list);
        //����
        Comparator c = Collections.reverseOrder();
        Collections.sort(list,c);
        System.out.println(list);
    }
    public static void method_4() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("fhsf",87));
        list.add(new Student("kom",546));
        list.add(new Student("cx",980));
        list.add(new Student("zf",12));
        list.add(new Student("w",454));
        System.out.println(list);
        //����
        Comparator c = Collections.reverseOrder(new MyComparator());
        Collections.sort(list,c);
        System.out.println(list);
    }
}
