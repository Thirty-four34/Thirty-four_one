package Collections������;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ��ʰ��
 * 2022/11/20 10:12:07
 **/


/*
static <T> binarySearch �����۰����
void reverse ���Ϸ�ת
void shuffle �Լ����������
synchronized��ͷ��XXX����
    ���̲߳���ȫ�ļ��ϣ�����̼߳�ȫ���ϡ�ʵ�ʿ����ü��Ͼ�ʹ�ò���ȫ��
 */
public class �������� {
    public static void main(String[] args) {
        method_2();
    }

    /*
       static <T> binarySearch �����۰���Ҷ�List�����۰���ң�
        ���ϱ����������У�����Ԫ�����ڵ�����û���ҵ����� (-�����-1)
     */
    public static void method() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(98);
        list.add(374);
        list.add(254);
        list.add(12);
        list.add(65);
        list.add(34);
        //�ȶԼ��Ͻ�������
        Collections.sort(list);
        //�����۰���Ҷ�List�����۰����
        int num=Collections.binarySearch(list,65);
        System.out.println(num);
        //��������ڸ�Ԫ�أ��򷵻�Ԫ�����ڵ�����û���ҵ����� (-�����-1)
         num=Collections.binarySearch(list,234);
        System.out.println(num);
    }

    //reverse ���Ϸ�ת
    public static void method_1() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(98);
        list.add(374);
        list.add(254);
        list.add(12);
        list.add(65);
        list.add(34);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }

    //shuffle �Լ����������
    public static void method_2() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(98);
        list.add(374);
        list.add(254);
        list.add(12);
        list.add(65);
        list.add(34);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }

}
